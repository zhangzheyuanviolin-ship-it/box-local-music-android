            package com.google.ai.edge.gallery.data;

            import android.os.Build;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.regex.Pattern;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.II11OlOIOOOl;
            import p000.IIl001iO0Io;
            import p000.IIlIOloOOO;
            import p000.IOOi1I;
            import p000.IOllO1I;
            import p000.IOo1Oilol;
            import p000.Il01100l;
            import p000.Il011I1OiO0I;
            import p000.O0000Ioio00;
            import p000.O0iO0Oii0o00;
            import p000.O1oIOiI11o0;
            import p000.OIOOoO1O1oO;
            import p000.Oi010OO0;
            import p000.Oii1lO01il;
            import p000.OlOoOIi0o;
            import p000.iIIiO0;
            import p000.iilooIoO0I;
            
            @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bO\b\u0087\b\u0018\u00002\u00020\u0001B·\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\f\u0012\u001c\b\u0002\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0017\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0002H\u0016¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010,J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010,J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010,J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010,J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010,J\u0010\u00102\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b4\u00105J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u00020\fHÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b:\u00109J\u0012\u0010;\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b;\u00109J\u0012\u0010<\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b<\u00109J\u0012\u0010=\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b=\u00109J\u0012\u0010>\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b>\u00109J\u0018\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b?\u00107J$\u0010@\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0018\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bD\u00107J\u0012\u0010E\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bE\u0010,J\u0012\u0010F\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bF\u0010,J\u001e\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bG\u0010AJ\u0012\u0010H\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\bL\u0010MJÐ\u0002\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\f2\u001c\b\u0002\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00172\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$HÆ\u0001¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\bP\u0010QJ\u001a\u0010S\u001a\u00020\u000e2\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bS\u0010TR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010U\u001a\u0004\bV\u0010,R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010U\u001a\u0004\bW\u0010,R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010U\u001a\u0004\bX\u0010,R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010U\u001a\u0004\bY\u0010,R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010U\u001a\u0004\bZ\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010[\u001a\u0004\b\\\u00103R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010]\u001a\u0004\b^\u00105R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010_\u001a\u0004\b`\u00107R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010a\u001a\u0004\bb\u00109R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010a\u001a\u0004\bc\u00109R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010a\u001a\u0004\bd\u00109R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0012\u0010a\u001a\u0004\be\u00109R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010a\u001a\u0004\bf\u00109R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010a\u001a\u0004\bg\u00109R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010_\u001a\u0004\bh\u00107R+\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010i\u001a\u0004\bj\u0010AR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010k\u001a\u0004\bl\u0010CR\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010_\u001a\u0004\bm\u00107R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010U\u001a\u0004\bn\u0010,R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010U\u001a\u0004\bo\u0010,R%\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u001f\u0010i\u001a\u0004\bp\u0010AR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010q\u001a\u0004\br\u0010IR\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010s\u001a\u0004\bt\u0010KR\u0019\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b%\u0010u\u001a\u0004\bv\u0010M¨\u0006w"}, d2 = {"Lcom/google/ai/edge/gallery/data/AllowedModel;", "", "", "name", "modelId", "modelFile", "commitHash", "description", "", "sizeInBytes", "Lcom/google/ai/edge/gallery/data/DefaultConfig;", "defaultConfig", "", "taskTypes", "", "disabled", "llmSupportImage", "llmSupportAudio", "llmSupportTinyGarden", "llmSupportMobileActions", "llmSupportThinking", "Lcom/google/ai/edge/gallery/data/ModelCapability;", "capabilities", "", "capabilityToTaskTypes", "", "minDeviceMemoryInGb", "bestForTaskTypes", "localModelFilePathOverride", "url", "Lcom/google/ai/edge/gallery/data/SocModelFile;", "socToModelFiles", "Lcom/google/ai/edge/gallery/data/RuntimeType;", "runtimeType", "Lcom/google/ai/edge/gallery/data/AICoreModelReleaseStage;", "aicoreReleaseStage", "Lcom/google/ai/edge/gallery/data/AICoreModelPreference;", "aicorePreference", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/google/ai/edge/gallery/data/DefaultConfig;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/google/ai/edge/gallery/data/RuntimeType;Lcom/google/ai/edge/gallery/data/AICoreModelReleaseStage;Lcom/google/ai/edge/gallery/data/AICoreModelPreference;)V", "LO1oIOiI11o0;", "toModel", "()LO1oIOiI11o0;", "toString", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "()J", "component7", "()Lcom/google/ai/edge/gallery/data/DefaultConfig;", "component8", "()Ljava/util/List;", "component9", "()Ljava/lang/Boolean;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "()Ljava/util/Map;", "component17", "()Ljava/lang/Integer;", "component18", "component19", "component20", "component21", "component22", "()Lcom/google/ai/edge/gallery/data/RuntimeType;", "component23", "()Lcom/google/ai/edge/gallery/data/AICoreModelReleaseStage;", "component24", "()Lcom/google/ai/edge/gallery/data/AICoreModelPreference;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/google/ai/edge/gallery/data/DefaultConfig;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/google/ai/edge/gallery/data/RuntimeType;Lcom/google/ai/edge/gallery/data/AICoreModelReleaseStage;Lcom/google/ai/edge/gallery/data/AICoreModelPreference;)Lcom/google/ai/edge/gallery/data/AllowedModel;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getModelId", "getModelFile", "getCommitHash", "getDescription", "J", "getSizeInBytes", "Lcom/google/ai/edge/gallery/data/DefaultConfig;", "getDefaultConfig", "Ljava/util/List;", "getTaskTypes", "Ljava/lang/Boolean;", "getDisabled", "getLlmSupportImage", "getLlmSupportAudio", "getLlmSupportTinyGarden", "getLlmSupportMobileActions", "getLlmSupportThinking", "getCapabilities", "Ljava/util/Map;", "getCapabilityToTaskTypes", "Ljava/lang/Integer;", "getMinDeviceMemoryInGb", "getBestForTaskTypes", "getLocalModelFilePathOverride", "getUrl", "getSocToModelFiles", "Lcom/google/ai/edge/gallery/data/RuntimeType;", "getRuntimeType", "Lcom/google/ai/edge/gallery/data/AICoreModelReleaseStage;", "getAicoreReleaseStage", "Lcom/google/ai/edge/gallery/data/AICoreModelPreference;", "getAicorePreference", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class AllowedModel {
                public static final int $stable = 8;
                private final AICoreModelPreference aicorePreference;
                private final AICoreModelReleaseStage aicoreReleaseStage;
                private final List<String> bestForTaskTypes;
                private final List<ModelCapability> capabilities;
                private final Map<ModelCapability, List<String>> capabilityToTaskTypes;
                private final String commitHash;
                private final DefaultConfig defaultConfig;
                private final String description;
                private final Boolean disabled;
                private final Boolean llmSupportAudio;
                private final Boolean llmSupportImage;
                private final Boolean llmSupportMobileActions;
                private final Boolean llmSupportThinking;
                private final Boolean llmSupportTinyGarden;
                private final String localModelFilePathOverride;
                private final Integer minDeviceMemoryInGb;
                private final String modelFile;
                private final String modelId;
                private final String name;
                private final RuntimeType runtimeType;
                private final long sizeInBytes;
                private final Map<String, SocModelFile> socToModelFiles;
                private final List<String> taskTypes;
                private final String url;

                public AllowedModel(String str, String str2, String str3, String str4, String str5, long j, DefaultConfig defaultConfig, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, List list2, Map map, Integer num, List list3, String str6, String str7, Map map2, RuntimeType runtimeType, AICoreModelReleaseStage aICoreModelReleaseStage, AICoreModelPreference aICoreModelPreference, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */             this(str, str2, str3, str4, str5, j, defaultConfig, list, (i & Barcode.FORMAT_QR_CODE) != 0 ? null : bool, (i & Barcode.FORMAT_UPC_A) != 0 ? null : bool2, (i & Barcode.FORMAT_UPC_E) != 0 ? null : bool3, (i & Barcode.FORMAT_PDF417) != 0 ? null : bool4, (i & Barcode.FORMAT_AZTEC) != 0 ? null : bool5, (i & 8192) != 0 ? null : bool6, (i & 16384) != 0 ? null : list2, (32768 & i) != 0 ? null : map, (65536 & i) != 0 ? null : num, (131072 & i) != 0 ? null : list3, (262144 & i) != 0 ? null : str6, (524288 & i) != 0 ? null : str7, (1048576 & i) != 0 ? null : map2, (2097152 & i) != 0 ? null : runtimeType, (4194304 & i) != 0 ? null : aICoreModelReleaseStage, (i & 8388608) != 0 ? null : aICoreModelPreference);
                }

                public static AllowedModel copy$default(AllowedModel allowedModel, String str, String str2, String str3, String str4, String str5, long j, DefaultConfig defaultConfig, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, List list2, Map map, Integer num, List list3, String str6, String str7, Map map2, RuntimeType runtimeType, AICoreModelReleaseStage aICoreModelReleaseStage, AICoreModelPreference aICoreModelPreference, int i, Object obj) {
                    AICoreModelPreference aICoreModelPreference2;
                    AICoreModelReleaseStage aICoreModelReleaseStage2;
/* 1 */             String str8 = (i & 1) != 0 ? allowedModel.name : str;
/* 1 */             String str9 = (i & 2) != 0 ? allowedModel.modelId : str2;
/* 1 */             String str10 = (i & 4) != 0 ? allowedModel.modelFile : str3;
/* 1 */             String str11 = (i & 8) != 0 ? allowedModel.commitHash : str4;
/* 1 */             String str12 = (i & 16) != 0 ? allowedModel.description : str5;
/* 1 */             long j2 = (i & 32) != 0 ? allowedModel.sizeInBytes : j;
/* 1 */             DefaultConfig defaultConfig2 = (i & 64) != 0 ? allowedModel.defaultConfig : defaultConfig;
/* 1 */             List list4 = (i & Barcode.FORMAT_ITF) != 0 ? allowedModel.taskTypes : list;
/* 1 */             Boolean bool7 = (i & Barcode.FORMAT_QR_CODE) != 0 ? allowedModel.disabled : bool;
/* 1 */             Boolean bool8 = (i & Barcode.FORMAT_UPC_A) != 0 ? allowedModel.llmSupportImage : bool2;
/* 1 */             Boolean bool9 = (i & Barcode.FORMAT_UPC_E) != 0 ? allowedModel.llmSupportAudio : bool3;
/* 1 */             Boolean bool10 = (i & Barcode.FORMAT_PDF417) != 0 ? allowedModel.llmSupportTinyGarden : bool4;
/* 1 */             Boolean bool11 = (i & Barcode.FORMAT_AZTEC) != 0 ? allowedModel.llmSupportMobileActions : bool5;
                    String str13 = str8;
/* 1 */             Boolean bool12 = (i & 8192) != 0 ? allowedModel.llmSupportThinking : bool6;
/* 1 */             List list5 = (i & 16384) != 0 ? allowedModel.capabilities : list2;
/* 1 */             Map map3 = (i & 32768) != 0 ? allowedModel.capabilityToTaskTypes : map;
/* 1 */             Integer num2 = (i & 65536) != 0 ? allowedModel.minDeviceMemoryInGb : num;
/* 1 */             List list6 = (i & 131072) != 0 ? allowedModel.bestForTaskTypes : list3;
/* 1 */             String str14 = (i & 262144) != 0 ? allowedModel.localModelFilePathOverride : str6;
/* 1 */             String str15 = (i & 524288) != 0 ? allowedModel.url : str7;
/* 1 */             Map map4 = (i & 1048576) != 0 ? allowedModel.socToModelFiles : map2;
/* 1 */             RuntimeType runtimeType2 = (i & 2097152) != 0 ? allowedModel.runtimeType : runtimeType;
/* 1 */             AICoreModelReleaseStage aICoreModelReleaseStage3 = (i & 4194304) != 0 ? allowedModel.aicoreReleaseStage : aICoreModelReleaseStage;
                    if ((i & 8388608) != 0) {
                        aICoreModelReleaseStage2 = aICoreModelReleaseStage3;
/* 1 */                 aICoreModelPreference2 = allowedModel.aicorePreference;
                    } else {
                        aICoreModelPreference2 = aICoreModelPreference;
                        aICoreModelReleaseStage2 = aICoreModelReleaseStage3;
                    }
/* 1 */             return allowedModel.copy(str13, str9, str10, str11, str12, j2, defaultConfig2, list4, bool7, bool8, bool9, bool10, bool11, bool12, list5, map3, num2, list6, str14, str15, map4, runtimeType2, aICoreModelReleaseStage2, aICoreModelPreference2);
                }

                public final String getName() {
/* 1 */             return this.name;
                }

                public final Boolean getLlmSupportImage() {
/* 1 */             return this.llmSupportImage;
                }

                public final Boolean getLlmSupportAudio() {
/* 1 */             return this.llmSupportAudio;
                }

                public final Boolean getLlmSupportTinyGarden() {
/* 1 */             return this.llmSupportTinyGarden;
                }

                public final Boolean getLlmSupportMobileActions() {
/* 1 */             return this.llmSupportMobileActions;
                }

                public final Boolean getLlmSupportThinking() {
/* 1 */             return this.llmSupportThinking;
                }

                public final List<ModelCapability> component15() {
/* 1 */             return this.capabilities;
                }

                public final Map<ModelCapability, List<String>> component16() {
/* 1 */             return this.capabilityToTaskTypes;
                }

                public final Integer getMinDeviceMemoryInGb() {
/* 1 */             return this.minDeviceMemoryInGb;
                }

                public final List<String> component18() {
/* 1 */             return this.bestForTaskTypes;
                }

                public final String getLocalModelFilePathOverride() {
/* 1 */             return this.localModelFilePathOverride;
                }

                public final String getModelId() {
/* 1 */             return this.modelId;
                }

                public final String getUrl() {
/* 1 */             return this.url;
                }

                public final Map<String, SocModelFile> component21() {
/* 1 */             return this.socToModelFiles;
                }

                public final RuntimeType getRuntimeType() {
/* 1 */             return this.runtimeType;
                }

                public final AICoreModelReleaseStage getAicoreReleaseStage() {
/* 1 */             return this.aicoreReleaseStage;
                }

                public final AICoreModelPreference getAicorePreference() {
/* 1 */             return this.aicorePreference;
                }

                public final String getModelFile() {
/* 1 */             return this.modelFile;
                }

                public final String getCommitHash() {
/* 1 */             return this.commitHash;
                }

                public final String getDescription() {
/* 1 */             return this.description;
                }

                public final long getSizeInBytes() {
/* 1 */             return this.sizeInBytes;
                }

                public final DefaultConfig getDefaultConfig() {
/* 1 */             return this.defaultConfig;
                }

                public final List<String> component8() {
/* 1 */             return this.taskTypes;
                }

                public final Boolean getDisabled() {
/* 1 */             return this.disabled;
                }

                public final AllowedModel copy(String name, String modelId, String modelFile, String commitHash, String description, long sizeInBytes, DefaultConfig defaultConfig, List<String> taskTypes, Boolean disabled, Boolean llmSupportImage, Boolean llmSupportAudio, Boolean llmSupportTinyGarden, Boolean llmSupportMobileActions, Boolean llmSupportThinking, List<? extends ModelCapability> capabilities, Map<ModelCapability, ? extends List<String>> capabilityToTaskTypes, Integer minDeviceMemoryInGb, List<String> bestForTaskTypes, String localModelFilePathOverride, String url, Map<String, SocModelFile> socToModelFiles, RuntimeType runtimeType, AICoreModelReleaseStage aicoreReleaseStage, AICoreModelPreference aicorePreference) {
/* 51 */            return new AllowedModel(name, modelId, modelFile, commitHash, description, sizeInBytes, defaultConfig, taskTypes, disabled, llmSupportImage, llmSupportAudio, llmSupportTinyGarden, llmSupportMobileActions, llmSupportThinking, capabilities, capabilityToTaskTypes, minDeviceMemoryInGb, bestForTaskTypes, localModelFilePathOverride, url, socToModelFiles, runtimeType, aicoreReleaseStage, aicorePreference);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof AllowedModel)) {
/* 7 */                 return false;
                    }
/* 11 */            AllowedModel allowedModel = (AllowedModel) other;
                    return O0000Ioio00.I0000O(this.name, allowedModel.name) && O0000Ioio00.I0000O(this.modelId, allowedModel.modelId) && O0000Ioio00.I0000O(this.modelFile, allowedModel.modelFile) && O0000Ioio00.I0000O(this.commitHash, allowedModel.commitHash) && O0000Ioio00.I0000O(this.description, allowedModel.description) && this.sizeInBytes == allowedModel.sizeInBytes && O0000Ioio00.I0000O(this.defaultConfig, allowedModel.defaultConfig) && O0000Ioio00.I0000O(this.taskTypes, allowedModel.taskTypes) && O0000Ioio00.I0000O(this.disabled, allowedModel.disabled) && O0000Ioio00.I0000O(this.llmSupportImage, allowedModel.llmSupportImage) && O0000Ioio00.I0000O(this.llmSupportAudio, allowedModel.llmSupportAudio) && O0000Ioio00.I0000O(this.llmSupportTinyGarden, allowedModel.llmSupportTinyGarden) && O0000Ioio00.I0000O(this.llmSupportMobileActions, allowedModel.llmSupportMobileActions) && O0000Ioio00.I0000O(this.llmSupportThinking, allowedModel.llmSupportThinking) && O0000Ioio00.I0000O(this.capabilities, allowedModel.capabilities) && O0000Ioio00.I0000O(this.capabilityToTaskTypes, allowedModel.capabilityToTaskTypes) && O0000Ioio00.I0000O(this.minDeviceMemoryInGb, allowedModel.minDeviceMemoryInGb) && O0000Ioio00.I0000O(this.bestForTaskTypes, allowedModel.bestForTaskTypes) && O0000Ioio00.I0000O(this.localModelFilePathOverride, allowedModel.localModelFilePathOverride) && O0000Ioio00.I0000O(this.url, allowedModel.url) && O0000Ioio00.I0000O(this.socToModelFiles, allowedModel.socToModelFiles) && this.runtimeType == allowedModel.runtimeType && this.aicoreReleaseStage == allowedModel.aicoreReleaseStage && this.aicorePreference == allowedModel.aicorePreference;
                }

                public final AICoreModelPreference getAicorePreference() {
/* 1 */             return this.aicorePreference;
                }

                public final AICoreModelReleaseStage getAicoreReleaseStage() {
/* 1 */             return this.aicoreReleaseStage;
                }

                public final List<String> getBestForTaskTypes() {
/* 1 */             return this.bestForTaskTypes;
                }

                public final List<ModelCapability> getCapabilities() {
/* 1 */             return this.capabilities;
                }

                public final Map<ModelCapability, List<String>> getCapabilityToTaskTypes() {
/* 1 */             return this.capabilityToTaskTypes;
                }

                public final String getCommitHash() {
/* 1 */             return this.commitHash;
                }

                public final DefaultConfig getDefaultConfig() {
/* 1 */             return this.defaultConfig;
                }

                public final String getDescription() {
/* 1 */             return this.description;
                }

                public final Boolean getDisabled() {
/* 1 */             return this.disabled;
                }

                public final Boolean getLlmSupportAudio() {
/* 1 */             return this.llmSupportAudio;
                }

                public final Boolean getLlmSupportImage() {
/* 1 */             return this.llmSupportImage;
                }

                public final Boolean getLlmSupportMobileActions() {
/* 1 */             return this.llmSupportMobileActions;
                }

                public final Boolean getLlmSupportThinking() {
/* 1 */             return this.llmSupportThinking;
                }

                public final Boolean getLlmSupportTinyGarden() {
/* 1 */             return this.llmSupportTinyGarden;
                }

                public final String getLocalModelFilePathOverride() {
/* 1 */             return this.localModelFilePathOverride;
                }

                public final Integer getMinDeviceMemoryInGb() {
/* 1 */             return this.minDeviceMemoryInGb;
                }

                public final String getModelFile() {
/* 1 */             return this.modelFile;
                }

                public final String getModelId() {
/* 1 */             return this.modelId;
                }

                public final String getName() {
/* 1 */             return this.name;
                }

                public final RuntimeType getRuntimeType() {
/* 1 */             return this.runtimeType;
                }

                public final long getSizeInBytes() {
/* 1 */             return this.sizeInBytes;
                }

                public final Map<String, SocModelFile> getSocToModelFiles() {
/* 1 */             return this.socToModelFiles;
                }

                public final List<String> getTaskTypes() {
/* 1 */             return this.taskTypes;
                }

                public final String getUrl() {
/* 1 */             return this.url;
                }

                public int hashCode() {
/* 50 */            int iI0000oI00 = IIl001iO0Io.I0000oI00((this.defaultConfig.hashCode() + IIlIOloOOO.I0000O(this.sizeInBytes, Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.name.hashCode() * 31, 31, this.modelId), 31, this.modelFile), 31, this.commitHash), 31, this.description), 31)) * 31, 31, this.taskTypes);
/* 54 */            Boolean bool = this.disabled;
/* 66 */            int iHashCode = (iI0000oI00 + (bool == null ? 0 : bool.hashCode())) * 31;
/* 67 */            Boolean bool2 = this.llmSupportImage;
/* 78 */            int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
/* 79 */            Boolean bool3 = this.llmSupportAudio;
/* 90 */            int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
/* 91 */            Boolean bool4 = this.llmSupportTinyGarden;
/* 102 */           int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
/* 103 */           Boolean bool5 = this.llmSupportMobileActions;
/* 114 */           int iHashCode5 = (iHashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
/* 115 */           Boolean bool6 = this.llmSupportThinking;
/* 126 */           int iHashCode6 = (iHashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
/* 127 */           List<ModelCapability> list = this.capabilities;
/* 138 */           int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
/* 139 */           Map<ModelCapability, List<String>> map = this.capabilityToTaskTypes;
/* 150 */           int iHashCode8 = (iHashCode7 + (map == null ? 0 : map.hashCode())) * 31;
/* 151 */           Integer num = this.minDeviceMemoryInGb;
/* 162 */           int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
/* 163 */           List<String> list2 = this.bestForTaskTypes;
/* 174 */           int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
/* 175 */           String str = this.localModelFilePathOverride;
/* 186 */           int iHashCode11 = (iHashCode10 + (str == null ? 0 : str.hashCode())) * 31;
/* 187 */           String str2 = this.url;
/* 198 */           int iHashCode12 = (iHashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
/* 199 */           Map<String, SocModelFile> map2 = this.socToModelFiles;
/* 210 */           int iHashCode13 = (iHashCode12 + (map2 == null ? 0 : map2.hashCode())) * 31;
/* 211 */           RuntimeType runtimeType = this.runtimeType;
/* 222 */           int iHashCode14 = (iHashCode13 + (runtimeType == null ? 0 : runtimeType.hashCode())) * 31;
/* 223 */           AICoreModelReleaseStage aICoreModelReleaseStage = this.aicoreReleaseStage;
/* 234 */           int iHashCode15 = (iHashCode14 + (aICoreModelReleaseStage == null ? 0 : aICoreModelReleaseStage.hashCode())) * 31;
/* 235 */           AICoreModelPreference aICoreModelPreference = this.aicorePreference;
/* 244 */           return iHashCode15 + (aICoreModelPreference != null ? aICoreModelPreference.hashCode() : 0);
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
                java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:181:0x03a9 A[PHI: r4
                  0x03a9: PHI (r4v4 boolean) = (r4v5 boolean), (r4v7 boolean) binds: [B:180:0x03a7, B:176:0x039d] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:185:0x03b4  */
                /* JADX WARN: Removed duplicated region for block: B:186:0x03b7  */
                /* JADX WARN: Removed duplicated region for block: B:189:0x03bd  */
                /* JADX WARN: Removed duplicated region for block: B:192:0x03c5  */
                /* JADX WARN: Removed duplicated region for block: B:193:0x03c8  */
                /* JADX WARN: Removed duplicated region for block: B:196:0x03ce  */
                /* JADX WARN: Removed duplicated region for block: B:197:0x03d1  */
                /* JADX WARN: Removed duplicated region for block: B:200:0x03d7  */
                /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final O1oIOiI11o0 toModel() {
                    boolean z;
                    ArrayList arrayList;
                    List list;
                    int i;
                    String str;
                    boolean z2;
                    boolean z3;
                    Map map;
                    RuntimeType runtimeType;
                    List list2;
                    boolean z4;
                    Collection collectionI00000oOI;
                    String visionAccelerator;
                    SocModelFile socModelFile;
/* 3 */             String commitHash = this.commitHash;
/* 5 */             String str2 = this.modelFile;
/* 7 */             String url = this.url;
/* 17 */            if (url == null) {
/* 25 */                url = IIl001iO0Io.I00100l0(IIl001iO0Io.I00111O("https://huggingface.co/", this.modelId, "/resolve/", commitHash, "/"), str2, "?download=true");
                    }
/* 29 */            long jLongValue = this.sizeInBytes;
/* 34 */            if (this.socToModelFiles != null && (!r10.isEmpty()) && (socModelFile = this.socToModelFiles.get(IOo1Oilol.I0000O)) != null) {
/* 55 */                socModelFile.toString();
/* 58 */                commitHash = socModelFile.getCommitHash();
/* 64 */                if (commitHash == null) {
/* 62 */                    commitHash = "-";
                        }
/* 67 */                String modelFile = socModelFile.getModelFile();
/* 62 */                str2 = modelFile != null ? modelFile : "-";
/* 75 */                url = socModelFile.getUrl();
/* 79 */                if (url == null) {
/* 95 */                    url = IIl001iO0Io.I00100l0(IIl001iO0Io.I00111O("https://huggingface.co/", this.modelId, "/resolve/", socModelFile.getCommitHash(), "/"), socModelFile.getModelFile(), "?download=true");
                        }
/* 99 */                Long sizeInBytes = socModelFile.getSizeInBytes();
/* 111 */               jLongValue = sizeInBytes != null ? sizeInBytes.longValue() : -1L;
                    }
/* 114 */           String str3 = commitHash;
/* 116 */           String str4 = str2;
/* 118 */           long j = jLongValue;
/* 185 */           boolean z5 = this.taskTypes.contains("llm_chat") || this.taskTypes.contains("llm_prompt_lab") || this.taskTypes.contains("llm_ask_audio") || this.taskTypes.contains("llm_ask_image") || this.taskTypes.contains("llm_mobile_actions") || this.taskTypes.contains("llm_tiny_garden");
/* 189 */           ArrayList arrayList2 = new ArrayList();
/* 192 */           Iterable arrayList3 = IOo1Oilol.I00000oIO;
/* 194 */           Accelerator accelerator = IOo1Oilol.I00000oOI;
/* 196 */           String strReplaceAll = this.description;
/* 198 */           int iIntValue = Barcode.FORMAT_UPC_E;
/* 200 */           if (z5) {
/* 204 */               Integer topK = this.defaultConfig.getTopK();
/* 216 */               int iIntValue2 = topK != null ? topK.intValue() : 64;
/* 221 */               Float topP = this.defaultConfig.getTopP();
/* 233 */               float fFloatValue = topP != null ? topP.floatValue() : 0.95f;
/* 239 */               Float temperature = this.defaultConfig.getTemperature();
/* 252 */               float fFloatValue2 = temperature != null ? temperature.floatValue() : 1.0f;
/* 256 */               Integer maxTokens = this.defaultConfig.getMaxTokens();
/* 260 */               if (maxTokens != null) {
/* 262 */                   iIntValue = maxTokens.intValue();
                        }
/* 266 */               int i2 = iIntValue;
/* 269 */               Integer maxContextLength = this.defaultConfig.getMaxContextLength();
/* 275 */               String accelerators = this.defaultConfig.getAccelerators();
/* 279 */               String str5 = Build.MODEL;
/* 285 */               if (str5 != null && OlOoOIi0o.I000oI1ioi(str5.toLowerCase(Locale.ROOT), "pixel", false)) {
/* 315 */                   strReplaceAll = Pattern.compile("\\bNPU\\b").matcher(this.description).replaceAll("TPU");
/* 336 */                   accelerators = accelerators != null ? Pattern.compile("\\bnpu\\b").matcher(accelerators).replaceAll("tpu") : null;
                        }
/* 343 */               if (accelerators != null) {
/* 352 */                   List<String> listI00IoIO0lI = OlOoOIi0o.I00IoIO0lI(accelerators, new String[]{","}, 6);
/* 358 */                   arrayList3 = new ArrayList();
/* 369 */                   for (String str6 : listI00IoIO0lI) {
                                switch (str6.hashCode()) {
                                    case 98728:
/* 428 */                               if (str6.equals("cpu")) {
/* 433 */                                   arrayList3.add(Accelerator.CPU);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 102572:
/* 415 */                               if (str6.equals("gpu")) {
/* 420 */                                   arrayList3.add(Accelerator.GPU);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 109299:
/* 402 */                               if (str6.equals("npu")) {
/* 407 */                                   arrayList3.add(Accelerator.NPU);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 115065:
/* 389 */                               if (str6.equals("tpu")) {
/* 394 */                                   arrayList3.add(Accelerator.TPU);
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                            }
                        }
/* 443 */               if (this.defaultConfig.getVisionAccelerator() != null && (visionAccelerator = this.defaultConfig.getVisionAccelerator()) != null) {
/* 453 */                   int iHashCode = visionAccelerator.hashCode();
/* 460 */                   if (iHashCode != 98728) {
/* 465 */                       if (iHashCode != 102572) {
/* 470 */                           if (iHashCode == 109299 && visionAccelerator.equals("npu")) {
/* 480 */                               accelerator = Accelerator.NPU;
                                    }
                                } else if (visionAccelerator.equals("gpu")) {
/* 490 */                           accelerator = Accelerator.GPU;
                                }
                            } else if (visionAccelerator.equals("cpu")) {
/* 500 */                       accelerator = Accelerator.CPU;
                            }
                        }
/* 528 */               boolean z6 = arrayList3.size() == 1 && (arrayList3.get(0) == Accelerator.NPU || arrayList3.get(0) == Accelerator.TPU);
/* 529 */               RuntimeType runtimeType2 = this.runtimeType;
/* 531 */               RuntimeType runtimeType3 = RuntimeType.AICORE;
/* 536 */               IOllO1I iOllO1I = iIIiO0.I00000oIO;
/* 538 */               if (runtimeType2 == runtimeType3) {
/* 547 */                   float f = fFloatValue2 > 1.0f ? 1.0f : fFloatValue2;
/* 555 */                   O0iO0Oii0o00 o0iO0Oii0o00 = new O0iO0Oii0o00(iOllO1I, String.valueOf(i2));
/* 573 */                   OIOOoO1O1oO oIOOoO1O1oO = new OIOOoO1O1oO(iIIiO0.I00000oOI, 5.0f, 100.0f, iIntValue2, ValueType.INT, true);
/* 590 */                   OIOOoO1O1oO oIOOoO1O1oO2 = new OIOOoO1O1oO(iIIiO0.I0000O, 0.0f, 1.0f, f, ValueType.FLOAT, true);
/* 600 */                   String label = ((Accelerator) arrayList3.get(0)).getLabel();
/* 605 */                   Iterable iterable = arrayList3;
/* 613 */                   ArrayList arrayList4 = new ArrayList(IOOi1I.I0000O(iterable, 10));
/* 616 */                   Iterator it = iterable.iterator();
/* 624 */                   while (it.hasNext()) {
/* 636 */                       arrayList4.add(((Accelerator) it.next()).getLabel());
                            }
/* 661 */                   collectionI00000oOI = IOOi1I.I000O01llI0(o0iO0Oii0o00, oIOOoO1O1oO, oIOOoO1O1oO2, new Oii1lO01il(label, arrayList4));
/* 665 */                   list2 = arrayList3;
/* 667 */                   z = false;
                        } else {
/* 672 */                   List<ModelCapability> list3 = this.capabilities;
/* 674 */                   if (z6) {
/* 688 */                       boolean z7 = list3 != null && list3.contains(ModelCapability.SPECULATIVE_DECODING);
/* 695 */                       O0iO0Oii0o00 o0iO0Oii0o002 = new O0iO0Oii0o00(iOllO1I, String.valueOf(i2));
/* 705 */                       String label2 = ((Accelerator) arrayList3.get(0)).getLabel();
/* 710 */                       Iterable iterable2 = arrayList3;
/* 718 */                       ArrayList arrayList5 = new ArrayList(IOOi1I.I0000O(iterable2, 10));
/* 721 */                       Iterator it2 = iterable2.iterator();
/* 729 */                       while (it2.hasNext()) {
/* 741 */                           arrayList5.add(((Accelerator) it2.next()).getLabel());
                                }
/* 752 */                       z = false;
/* 760 */                       ArrayList arrayListI000OiO = IOOi1I.I000OiO(o0iO0Oii0o002, new Oii1lO01il(label2, arrayList5));
/* 764 */                       if (z7) {
/* 773 */                           arrayListI000OiO.add(new II11OlOIOOOl(iIIiO0.I000oI1ioi));
                                }
/* 776 */                       collectionI00000oOI = arrayListI000OiO;
/* 777 */                       list2 = arrayList3;
                            } else {
/* 780 */                       z = false;
/* 807 */                       boolean z8 = (list3 != null && list3.contains(ModelCapability.LLM_THINKING)) || O0000Ioio00.I0000O(this.llmSupportThinking, Boolean.TRUE);
/* 809 */                       List<ModelCapability> list4 = this.capabilities;
/* 811 */                       if (list4 == null || !list4.contains(ModelCapability.SPECULATIVE_DECODING)) {
/* 827 */                           list2 = arrayList3;
/* 829 */                           z4 = false;
                                } else {
/* 822 */                           list2 = arrayList3;
/* 824 */                           z4 = true;
                                }
/* 831 */                       collectionI00000oOI = iilooIoO0I.I00000oOI(i2, maxContextLength, iIntValue2, fFloatValue, fFloatValue2, list2, z8, z4);
                            }
                        }
/* 839 */               arrayList = new ArrayList(collectionI00000oOI);
/* 843 */               i = i2;
/* 845 */               list = list2;
                    } else {
/* 851 */               z = false;
/* 853 */               arrayList = arrayList2;
/* 854 */               list = arrayList3;
/* 856 */               i = 1024;
                    }
/* 847 */           Accelerator accelerator2 = accelerator;
/* 849 */           String str7 = strReplaceAll;
/* 861 */           String strI000o00OoI0I = IIl001iO0Io.I000o00OoI0I("https://huggingface.co/", this.modelId);
/* 871 */           if (this.runtimeType == RuntimeType.AICORE) {
/* 873 */               strI000o00OoI0I = "https://developers.google.com/ml-kit/terms";
/* 869 */               str = "";
                    } else {
/* 880 */               str = url;
                    }
/* 877 */           String str8 = strI000o00OoI0I;
                    boolean z9 = !z5;
/* 885 */           String str9 = this.name;
/* 887 */           Integer num = this.minDeviceMemoryInGb;
/* 889 */           Boolean bool = this.llmSupportImage;
/* 891 */           Boolean bool2 = Boolean.TRUE;
/* 893 */           boolean zI0000O = O0000Ioio00.I0000O(bool, bool2);
/* 899 */           boolean zI0000O2 = O0000Ioio00.I0000O(this.llmSupportAudio, bool2);
/* 905 */           boolean zI0000O3 = O0000Ioio00.I0000O(this.llmSupportTinyGarden, bool2);
/* 911 */           boolean zI0000O4 = O0000Ioio00.I0000O(this.llmSupportMobileActions, bool2);
/* 915 */           List<ModelCapability> list5 = this.capabilities;
/* 917 */           if (list5 != null) {
/* 925 */               z2 = true;
/* 926 */               if (list5.contains(ModelCapability.LLM_THINKING)) {
/* 938 */                   z3 = z2;
                        }
/* 943 */               List list6 = this.capabilities;
/* 945 */               List list7 = Il01100l.I00iOIl;
/* 952 */               List list8 = list6 != null ? list7 : list6;
/* 954 */               map = this.capabilityToTaskTypes;
/* 956 */               if (map == null) {
/* 958 */                   map = Il011I1OiO0I.I00iOIl;
                        }
/* 960 */               Map map2 = map;
/* 962 */               List list9 = this.bestForTaskTypes;
/* 969 */               List list10 = list9 != null ? list7 : list9;
/* 971 */               String str10 = this.localModelFilePathOverride;
/* 978 */               String str11 = str10 != null ? "" : str10;
/* 980 */               runtimeType = this.runtimeType;
/* 982 */               if (runtimeType == null) {
/* 984 */                   runtimeType = RuntimeType.LITERT_LM;
                        }
/* 1011 */              return new O1oIOiI11o0(str9, str7, arrayList, str8, list10, num, str, j, str4, str3, null, z5, this.aicoreReleaseStage, this.aicorePreference, runtimeType, str11, z9, z9, zI0000O, zI0000O2, zI0000O3, zI0000O4, z3, false, list8, map2, i, list, accelerator2, 275843074, 2044);
                    }
/* 929 */           z2 = true;
/* 936 */           if (!O0000Ioio00.I0000O(this.llmSupportThinking, bool2)) {
/* 941 */               z3 = z;
                    }
/* 943 */           List list62 = this.capabilities;
/* 945 */           List list72 = Il01100l.I00iOIl;
/* 952 */           if (list62 != null) {
                    }
/* 954 */           map = this.capabilityToTaskTypes;
/* 956 */           if (map == null) {
                    }
/* 960 */           Map map22 = map;
/* 962 */           List list92 = this.bestForTaskTypes;
/* 969 */           if (list92 != null) {
                    }
/* 971 */           String str102 = this.localModelFilePathOverride;
/* 978 */           if (str102 != null) {
                    }
/* 980 */           runtimeType = this.runtimeType;
/* 982 */           if (runtimeType == null) {
                    }
/* 1011 */          return new O1oIOiI11o0(str9, str7, arrayList, str8, list10, num, str, j, str4, str3, null, z5, this.aicoreReleaseStage, this.aicorePreference, runtimeType, str11, z9, z9, zI0000O, zI0000O2, zI0000O3, zI0000O4, z3, false, list8, map22, i, list, accelerator2, 275843074, 2044);
                }

                public String toString() {
/* 21 */            return this.modelId + "/" + this.modelFile;
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 1 */         public AllowedModel(String str, String str2, String str3, String str4, String str5, long j, DefaultConfig defaultConfig, List<String> list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, List<? extends ModelCapability> list2, Map<ModelCapability, ? extends List<String>> map, Integer num, List<String> list3, String str6, String str7, Map<String, SocModelFile> map2, RuntimeType runtimeType, AICoreModelReleaseStage aICoreModelReleaseStage, AICoreModelPreference aICoreModelPreference) {
/* 3 */             this.name = str;
/* 4 */             this.modelId = str2;
/* 5 */             this.modelFile = str3;
/* 6 */             this.commitHash = str4;
/* 7 */             this.description = str5;
/* 8 */             this.sizeInBytes = j;
/* 9 */             this.defaultConfig = defaultConfig;
/* 10 */            this.taskTypes = list;
/* 11 */            this.disabled = bool;
/* 12 */            this.llmSupportImage = bool2;
/* 13 */            this.llmSupportAudio = bool3;
/* 14 */            this.llmSupportTinyGarden = bool4;
/* 15 */            this.llmSupportMobileActions = bool5;
/* 16 */            this.llmSupportThinking = bool6;
/* 17 */            this.capabilities = list2;
/* 18 */            this.capabilityToTaskTypes = map;
/* 19 */            this.minDeviceMemoryInGb = num;
/* 20 */            this.bestForTaskTypes = list3;
/* 21 */            this.localModelFilePathOverride = str6;
/* 22 */            this.url = str7;
/* 23 */            this.socToModelFiles = map2;
/* 24 */            this.runtimeType = runtimeType;
/* 25 */            this.aicoreReleaseStage = aICoreModelReleaseStage;
/* 26 */            this.aicorePreference = aICoreModelPreference;
                }
            }
