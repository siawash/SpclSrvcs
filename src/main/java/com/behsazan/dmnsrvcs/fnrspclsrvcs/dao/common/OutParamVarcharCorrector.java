package com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.common;

import org.springframework.jdbc.core.SqlReturnType;

import java.io.UnsupportedEncodingException;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

public class OutParamVarcharCorrector implements SqlReturnType {

    @Override
    public Object getTypeValue(CallableStatement callableStatement, int i, int j, String s) throws SQLException {
        try {

            if (j == Types.VARCHAR || j == Types.CHAR) {
                return ((callableStatement.getBytes(i) != null) ? (new String(callableStatement.getBytes(i), "Cp1256")) : callableStatement.getObject(i));
            } else {
                return callableStatement.getObject(i);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
}

