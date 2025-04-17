package com.nokia.dos.md;

import com.nokia.dos.domainadaptation.mechanismdriver.MechanismDriver;
import com.nokia.dos.domainadaptation.mechanismdriver.NeMechanismDriver;
import com.nokia.dos.domainadaptation.mechanismdriver.NeMechanismDriverSession;
import com.nokia.dos.domainadaptation.mechanismdriver.OperationInfo;
import com.nokia.dos.domainadaptation.mechanismdriver.OperationType;
import com.nokia.dos.domainadaptation.nero.NeroConnection;

@MechanismDriver
public class ENSSMFMechanismDriver implements NeMechanismDriver {

    @Override
    public NeMechanismDriverSession createSession(NeroConnection neroConnection) {
        return new ENSSMFMechanismDriverSession(neroConnection);
    }

    @Override
    public OperationInfo getOperationInfo(String operationName, OperationType operationType) {
        // Implement operation info logic
        return null;
    }
}
