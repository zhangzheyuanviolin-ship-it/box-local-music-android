            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            
            public abstract class OlI1Io0o00 {
                public static final List I00000oIO;
                public static final List I00000oOI;

                static {
/* 53 */            List<OOooO0l1Ooi> listI000O01llI0 = IOOi1I.I000O01llI0(new OOooO0l1Ooi("dit_model.tflite", "sg_core.litert", 344293232L), new OOooO0l1Ooi("conditioners_float32.tflite", "sg_text.litert", 440190572L), new OOooO0l1Ooi("autoencoder_model.tflite", "sg_decode.litert", 312588244L), new OOooO0l1Ooi("spiece.model", "sg_vocab.spm", 791656L));
/* 57 */            I00000oIO = listI000O01llI0;
/* 69 */            for (OOooO0l1Ooi oOooO0l1Ooi : listI000O01llI0) {
/* 83 */                if (oOooO0l1Ooi.I00000oOI.equals("sg_core.litert")) {
/* 89 */                    String strConcat = "https://huggingface.co/jegly/audio/resolve/main/".concat(oOooO0l1Ooi.I00000oIO);
/* 93 */                    String str = oOooO0l1Ooi.I00000oOI;
/* 95 */                    long j = oOooO0l1Ooi.I0000Il00O;
/* 97 */                    List list = I00000oIO;
/* 103 */                   ArrayList arrayList = new ArrayList();
/* 114 */                   for (Object obj : list) {
/* 129 */                       if (!((OOooO0l1Ooi) obj).I00000oOI.equals("sg_core.litert")) {
/* 131 */                           arrayList.add(obj);
                                }
                            }
/* 143 */                   ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 146 */                   Iterator it = arrayList.iterator();
/* 154 */                   while (it.hasNext()) {
/* 160 */                       OOooO0l1Ooi oOooO0l1Ooi2 = (OOooO0l1Ooi) it.next();
/* 179 */                       arrayList2.add(new O1oIOoi0oo(oOooO0l1Ooi2.I0000Il00O, oOooO0l1Ooi2.I00000oOI, "https://huggingface.co/jegly/audio/resolve/main/".concat(oOooO0l1Ooi2.I00000oIO), oOooO0l1Ooi2.I00000oOI));
                            }
/* 245 */                   I00000oOI = Collections.singletonList(new O1oIOiI11o0("SoundGen", "On-device text-to-audio — describe a sound or piece of music and generate it offline. Downloads ~1.1GB on first use.", null, null, null, null, strConcat, j, str, "v1.0.0", arrayList2, false, null, null, null, null, false, false, false, false, false, false, false, false, null, null, 0, null, null, -790406, 2047));
/* 247 */                   return;
                        }
                    }
/* 250 */           OIiilo1Ool0o.I000II("Collection contains no element matching the predicate.");
                }
            }
