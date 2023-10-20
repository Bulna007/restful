package com.ri.api.automaticparam;

public class AwbNo {
    private String sourceLocationCode;
    private String destinationCode;
    private int parcelNo;

    /*single arg constructor*/
    /*public AwbNo(String in){
        this.sourceLocationCode = in.substring(0,3);
        this.destinationCode = in.substring(3,7);
        this.parcelNo = Integer.parseInt(in.substring(7,10));
    }*/

    /*public AwbNo(String in){
        this.sourceLocationCode = in.substring(0,3);
        this.destinationCode = in.substring(3,7);
        this.parcelNo = Integer.parseInt(in.substring(7,10));
    }*/


    public String getSourceLocationCode() {
        return sourceLocationCode;
    }

    public void setSourceLocationCode(String sourceLocationCode) {
        this.sourceLocationCode = sourceLocationCode;
    }

    public String getDestinationCode() {
        return destinationCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
    }

    public int getParcelNo() {
        return parcelNo;
    }

    public void setParcelNo(int parcelNo) {
        this.parcelNo = parcelNo;
    }

    /*valueOf*/
    /*public static AwbNo valueOf(String in){
        AwbNo awbNo = new AwbNo();
        awbNo.setSourceLocationCode(in.substring(0,3));
        awbNo.setDestinationCode(in.substring(3,7));
        awbNo.setParcelNo(Integer.parseInt(in.substring(7,10)));
        return awbNo;
    }*/

    /*fromString*/
    public static AwbNo fromString(String in){
        AwbNo awbNo = new AwbNo();
        awbNo.setSourceLocationCode(in.substring(0,3));
        awbNo.setDestinationCode(in.substring(3,7));
        awbNo.setParcelNo(Integer.parseInt(in.substring(7,10)));
        System.out.println("fromString");
        return awbNo;
    }

    @Override
    public String toString() {
        return "AwbNo{" +
                "sourceLocationCode='" + sourceLocationCode + '\'' +
                ", destinationCode='" + destinationCode + '\'' +
                ", parcelNo=" + parcelNo +
                '}';
    }
}
