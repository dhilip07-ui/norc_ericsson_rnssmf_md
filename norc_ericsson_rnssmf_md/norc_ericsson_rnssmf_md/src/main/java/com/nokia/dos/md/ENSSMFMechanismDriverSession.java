package com.nokia.dos.md;

import com.nokia.dos.domainadaptation.mechanismdriver.NeMechanismDriverSession;
import com.nokia.dos.domainadaptation.mechanismdriver.OperationResponse;
import com.nokia.dos.domainadaptation.nero.NeroConnection;

public class ENSSMFMechanismDriverSession implements NeMechanismDriverSession {

    private final NeroConnection neroConnection;

    public ENSSMFMechanismDriverSession(NeroConnection neroConnection) {
        this.neroConnection = neroConnection;
    }

    @Override
    public OperationResponse executeOperation(String operationName, Object... arguments) {
        // Implement operation execution logic
        return null;
    }

    @Override
    public OperationResponse getOperationStatus(Object pollingInformation) {
        // Implement operation status checking logic
        return null;
    }
}
