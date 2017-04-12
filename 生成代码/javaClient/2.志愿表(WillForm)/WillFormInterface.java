public class WillFormInterface extends BaseInterface {
    private static WillFormInterface WillFormInterface;
    private WillFormInterface(){
    }
    static {
         WillFormInterface = new WillFormInterface();
    }
    public static WillFormInterface getWillFormInterface(){
        return WillFormInterface;
    }
    //初始化志愿表
    public WillFormInfoResponse initForm(ApplyInfoRequest applyInfoRequest) throws Exception {
        HttpInput input = new HttpInput(-1, UrlConstants.Url + "willform/initForm");
        input.setData(applyInfoRequest);

        HttpOutputPojo<WillFormInfoResponse> outputPojo = fromHttp(input, new TypeReference<HttpOutputPojo<WillFormInfoResponse>>(){});
        return outputPojo.getData();
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

    //保存志愿表
    public SaveWillFormResponse saveWillForm(WillFormInfoRequest willFormInfoRequest) throws Exception {
        HttpInput input = new HttpInput(-1, UrlConstants.Url + "willform/saveWillForm");
        input.setData(willFormInfoRequest);

        HttpOutputPojo<SaveWillFormResponse> outputPojo = fromHttp(input, new TypeReference<HttpOutputPojo<SaveWillFormResponse>>(){});
        return outputPojo.getData();
    }

    //获取我的志愿表详情
    public WillFormInfoResponse getWillFormInfo(WillFormRequest willFormRequest) throws Exception {
        HttpInput input = new HttpInput(-1, UrlConstants.Url + "willform/getWillFormInfo");
        input.setData(willFormRequest);

        HttpOutputPojo<WillFormInfoResponse> outputPojo = fromHttp(input, new TypeReference<HttpOutputPojo<WillFormInfoResponse>>(){});
        return outputPojo.getData();
    }

    //推送志愿交流表：1、推送新志愿表，willFormId不能赋值。2、推送已有志愿表，willFormInfo不能赋值。3、推送修改志愿表，willFormId和willFormInfo都需要赋值。（必须严格遵守）
    public SaveWillFormResponse pushWillForm(WillFormPushInfoRequest willFormPushInfoRequest) throws Exception {
        HttpInput input = new HttpInput(-1, UrlConstants.Url + "willform/pushWillForm");
        input.setData(willFormPushInfoRequest);

        HttpOutputPojo<SaveWillFormResponse> outputPojo = fromHttp(input, new TypeReference<HttpOutputPojo<SaveWillFormResponse>>(){});
        return outputPojo.getData();
    }

    //获取推送志愿表详情
    public WillFormModifyRecordResponse getWillFormModifyRecord(WillFormRequest willFormRequest) throws Exception {
        HttpInput input = new HttpInput(-1, UrlConstants.Url + "willform/getWillFormModifyRecord");
        input.setData(willFormRequest);

        HttpOutputPojo<WillFormModifyRecordResponse> outputPojo = fromHttp(input, new TypeReference<HttpOutputPojo<WillFormModifyRecordResponse>>(){});
        return outputPojo.getData();
    }

    //查看志愿报告
    public void getWillFormReport(WillFormInfoRequest willFormInfoRequest) throws Exception {
        HttpInput input = new HttpInput(-1, UrlConstants.Url + "willform/getWillFormReport");
        input.setData(willFormInfoRequest);

        HttpOutputPojo<WillFormReportURL(void)> outputPojo = fromHttp(input, new TypeReference<HttpOutputPojo<WillFormReportURL(void)>>(){});
        return outputPojo.getData();
    }

}
