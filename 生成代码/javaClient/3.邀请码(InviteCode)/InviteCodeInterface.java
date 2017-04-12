public class InviteCodeInterface extends BaseInterface {
    private static InviteCodeInterface InviteCodeInterface;
    private InviteCodeInterface(){
    }
    static {
         InviteCodeInterface = new InviteCodeInterface();
    }
    public static InviteCodeInterface getInviteCodeInterface(){
        return InviteCodeInterface;
    }
    //获取冲、稳、保院校数量
    public ChanceNumResponse getChanceNum(ApplyInfoRequest applyInfoRequest) throws Exception {
        HttpInput input = new HttpInput(-1, UrlConstants.Url + "willform/getChanceNum");
        input.setData(applyInfoRequest);

        HttpOutputPojo<ChanceNumResponse> outputPojo = fromHttp(input, new TypeReference<HttpOutputPojo<ChanceNumResponse>>(){});
        return outputPojo.getData();
    }

    //根据筛选条件获取冲、稳、保院校
    public UniversityListResponse getChanceUniversity(ApplyUniversityInfoRequest applyUniversityInfoRequest) throws Exception {
        HttpInput input = new HttpInput(-1, UrlConstants.Url + "willform/getChanceUniversity");
        input.setData(applyUniversityInfoRequest);

        HttpOutputPojo<UniversityListResponse> outputPojo = fromHttp(input, new TypeReference<HttpOutputPojo<UniversityListResponse>>(){});
        return outputPojo.getData();
    }

}
