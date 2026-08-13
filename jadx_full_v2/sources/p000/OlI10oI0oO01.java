            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public abstract class OlI10oI0oO01 {
                public static final OOooIoI I00000oIO = new OOooIoI("t5gemma_enc_int8.tflite", "sghd_text.litert", 286972704);
                public static final OOooIoI I00000oOI = new OOooIoI("tokenizer.model", "sghd_vocab.spm", 4241003);
                public static final List I0000Il00O;
                public static final List I0000O;

                static {
/* 43 */            O1oIOiI11o0 o1oIOiI11o0I00000oIO = I00000oIO("SoundGen HD", "Higher-quality on-device text-to-audio — describe a sound or piece of music and generate it offline (up to ~24s). Downloads ~2.1GB on first use; generation takes ~1 minute.", "dit_L256_int8.tflite", 1468553968L, "ae_dec_L256_int8.tflite", 434121120L);
/* 61 */            O1oIOiI11o0 o1oIOiI11o0I00000oIO2 = I00000oIO("SoundGen HD Long", "Same high quality, much longer clips — up to ~3 minutes, fully offline. Downloads ~2.1GB on first use. Generation is slow (~10-15 minutes per clip) — best for long-form pieces.", "dit_L2048_int8.tflite", 1469012720L, "ae_dec_L2048_int8.tflite", 447063056L);
/* 69 */            I0000Il00O = Collections.singletonList(o1oIOiI11o0I00000oIO);
/* 75 */            I0000O = Collections.singletonList(o1oIOiI11o0I00000oIO2);
                }

                public static final O1oIOiI11o0 I00000oIO(String str, String str2, String str3, long j, String str4, long j2) {
/* 20 */            List listI000O01llI0 = IOOi1I.I000O01llI0(new OOooIoI(str4, "sghd_decode.litert", j2), I00000oIO, I00000oOI);
/* 28 */            String strConcat = "https://huggingface.co/jegly/noise/resolve/main/".concat(str3);
/* 32 */            List<OOooIoI> list = listI000O01llI0;
/* 42 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 53 */            for (OOooIoI oOooIoI : list) {
/* 78 */                arrayList.add(new O1oIOoi0oo(oOooIoI.I0000Il00O, oOooIoI.I00000oOI, "https://huggingface.co/jegly/noise/resolve/main/".concat(oOooIoI.I00000oIO), oOooIoI.I00000oOI));
                    }
/* 138 */           return new O1oIOiI11o0(str, str2, null, null, null, null, strConcat, j, "sghd_core.litert", "v1.0.0", arrayList, false, null, null, null, null, false, false, false, false, false, false, false, false, null, null, 0, null, null, -790406, 2047);
                }
            }
