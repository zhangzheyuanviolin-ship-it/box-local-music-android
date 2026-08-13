            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import p000.I000II;
            import p000.IIlIOloOOO;
            import p000.OlOoOIi0o;
            
            @Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aq\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"getOfflineTtsConfig", "Lcom/k2fsa/sherpa/onnx/OfflineTtsConfig;", "modelDir", "", "modelName", "acousticModelName", "vocoder", "voices", "lexicon", "dataDir", "dictDir", "ruleFsts", "ruleFars", "numThreads", "", "isKitten", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)Lcom/k2fsa/sherpa/onnx/OfflineTtsConfig;", "sherpa_onnx_release"}, m18k = 2, mv = {1, 7, 1}, xi = 48)
            public final class TtsKt {
                public static final OfflineTtsConfig getOfflineTtsConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, boolean z) {
                    OfflineTtsKokoroModelConfig offlineTtsKokoroModelConfig;
                    String strI000oI1ioi = str6;
/* 2 */             int iIntValue = num != null ? num.intValue() : str5.length() > 0 ? 4 : 2;
/* 3 */             if (str2.length() == 0 && str3.length() == 0) {
/* 4 */                 I000II.I000iOII("Please specify a TTS model");
                        return null;
                    }
/* 5 */             if (str2.length() > 0 && str3.length() > 0) {
/* 6 */                 I000II.I000iOII("Please specify either a VITS or a Matcha model, but not both");
                        return null;
                    }
/* 7 */             if (str3.length() > 0 && str4.length() == 0) {
/* 8 */                 I000II.I000iOII("Please provide vocoder for Matcha TTS");
                        return null;
                    }
/* 15 */            OfflineTtsVitsModelConfig offlineTtsVitsModelConfig = (str2.length() <= 0 || str5.length() != 0) ? new OfflineTtsVitsModelConfig(null, null, null, null, null, 0.0f, 0.0f, 0.0f, 255, null) : new OfflineTtsVitsModelConfig(IIlIOloOOO.I000oI1ioi('/', str, str2), IIlIOloOOO.I000oI1ioi('/', str, strI000oI1ioi), str.concat("/tokens.txt"), str7, null, 0.0f, 0.0f, 0.0f, 240, null);
/* 22 */            OfflineTtsMatchaModelConfig offlineTtsMatchaModelConfig = str3.length() > 0 ? new OfflineTtsMatchaModelConfig(IIlIOloOOO.I000oI1ioi('/', str, str3), str4, IIlIOloOOO.I000oI1ioi('/', str, strI000oI1ioi), str.concat("/tokens.txt"), str7, null, 0.0f, 0.0f, 224, null) : new OfflineTtsMatchaModelConfig(null, null, null, null, null, null, 0.0f, 0.0f, 255, null);
/* 23 */            if (str5.length() <= 0 || z) {
/* 34 */                offlineTtsKokoroModelConfig = new OfflineTtsKokoroModelConfig(null, null, null, null, null, null, null, 0.0f, 255, null);
                    } else {
/* 25 */                String strI000oI1ioi2 = IIlIOloOOO.I000oI1ioi('/', str, str2);
/* 26 */                String strI000oI1ioi3 = IIlIOloOOO.I000oI1ioi('/', str, str5);
/* 27 */                String strConcat = str.concat("/tokens.txt");
/* 29 */                if (!strI000oI1ioi.equals("") && !OlOoOIi0o.I000oI1ioi(strI000oI1ioi, ",", false)) {
/* 32 */                    strI000oI1ioi = IIlIOloOOO.I000oI1ioi('/', str, strI000oI1ioi);
                        }
/* 33 */                offlineTtsKokoroModelConfig = new OfflineTtsKokoroModelConfig(strI000oI1ioi2, strI000oI1ioi3, strConcat, str7, strI000oI1ioi, null, null, 0.0f, 224, null);
                    }
/* 43 */            return new OfflineTtsConfig(new OfflineTtsModelConfig(offlineTtsVitsModelConfig, offlineTtsMatchaModelConfig, offlineTtsKokoroModelConfig, null, z ? new OfflineTtsKittenModelConfig(IIlIOloOOO.I000oI1ioi('/', str, str2), IIlIOloOOO.I000oI1ioi('/', str, str5), str.concat("/tokens.txt"), str7, 0.0f, 16, null) : new OfflineTtsKittenModelConfig(null, null, null, null, 0.0f, 31, null), null, null, iIntValue, true, "cpu", 104, null), str9, str10, 0, 0.0f, 24, null);
                }
            }
