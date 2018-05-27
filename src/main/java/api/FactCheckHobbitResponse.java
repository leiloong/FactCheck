package api;

import java.util.ArrayList;

/**
 * @author DANISH AHMED on 4/22/2018
 */
public class FactCheckHobbitResponse {
    private static final String RESPONSE =
            "<http://swc2017.aksw.org/%s/dataset/%s> " +
                    "<http://swc2017.aksw.org/hasTruthValue> \"%s\"" +
                    "^^<http://www.w3.org/2001/XMLSchema#double> .";

    private String taskId;
    private double truthValue = 0.0;
    private String fileTrace;
    public ArrayList<ComplexProofs> complexProofs;
    private String responseData;



    FactCheckHobbitResponse(String taskId, double truthValue, String fileTrace, ArrayList<ComplexProofs> complexProofs) {
        this.taskId = taskId;
        this.truthValue = truthValue;
        this.fileTrace = fileTrace;
        this.complexProofs = complexProofs;
        init();
    }

    private void init() {
        responseData = String.format(RESPONSE, taskId, fileTrace, truthValue);
    }

    public double getTruthValue() {
        return truthValue;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getResponseData() {
        return responseData;
    }

    public ArrayList<ComplexProofs> getComplexProofs() {
        return complexProofs;
    }

    public void setComplexProofs(ArrayList<ComplexProofs> complexProofs) {
        this.complexProofs = complexProofs;
    }
}
