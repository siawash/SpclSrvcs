package com.behsazan.dmnsrvcs.fnrspclsrvcs.config;


import java.io.UnsupportedEncodingException;
import javax.annotation.PostConstruct;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Queue;
import javax.jms.QueueConnectionFactory;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.ServletInitializer;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.common.AppLogger;

@Service
@Lazy
@PropertySource(ignoreResourceNotFound = true, encoding = "UTF-8", value = { "classpath:accjms.properties" })
public class AccountingMessageSenderService {
	
	@Value("${acc.queue.name}")
	private String queueName;
	
	@Value("${acc.connection.factory.name}")
	private String connectionFactoryName;

	@Autowired
	private ApplicationContext context;
	
	@Autowired
	private AppLogger logger;
	
	private JmsTemplate accJmsTemplate;
	
	@PostConstruct
	public void init() {
		QueueConnectionFactory factory = null;
		
		try {
			Context namingContext = new InitialContext();
			factory = (QueueConnectionFactory) namingContext.lookup(connectionFactoryName);
		    CachingConnectionFactory cachingConnectionFactory = new CachingConnectionFactory(factory);
		    cachingConnectionFactory.setSessionCacheSize(20);
		    Queue queue = (Queue) namingContext.lookup(queueName);
		    accJmsTemplate = new JmsTemplate(factory);
		    accJmsTemplate.setDefaultDestination(queue);	    
		    
		} catch (Exception e) {
			logger.log("exception inside AccountingMessageService.init(): " + e.getMessage());
			ServletInitializer.exitApplication(context, -200);
		}
	}
	
	public void send(final String message) {
		try {
			accJmsTemplate.send(new MessageCreator() {				
				@Override
				public Message createMessage(Session session) throws JMSException {
					TextMessage msg = null;
					try {
						msg = session.createTextMessage(new String(message.getBytes("UTF-8")));
					} catch (UnsupportedEncodingException e) {
						logger.log("exception inside AccountingMessageService.createMessage(): " + e.getMessage());
					}

					logger.log(msg.toString());
					
					return msg;
				}
			});
		} catch (Exception e) {
			logger.log("exception inside AccountingMessageService.send(): " + e.getMessage());
		}
	}
}

