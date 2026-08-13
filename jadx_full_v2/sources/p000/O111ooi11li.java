            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.system.ErrnoException;
            import android.system.Os;
            import android.util.Log;
            import com.google.ai.edge.gallery.data.Accelerator;
            import com.google.ai.edge.gallery.data.ValueType;
            import com.google.ai.edge.litertlm.Backend;
            import com.google.ai.edge.litertlm.Capabilities;
            import com.google.ai.edge.litertlm.Content;
            import com.google.ai.edge.litertlm.Contents;
            import com.google.ai.edge.litertlm.Conversation;
            import com.google.ai.edge.litertlm.ConversationConfig;
            import com.google.ai.edge.litertlm.Engine;
            import com.google.ai.edge.litertlm.EngineConfig;
            import com.google.ai.edge.litertlm.ExperimentalFlags;
            import com.google.ai.edge.litertlm.Message;
            import com.google.ai.edge.litertlm.SamplerConfig;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.ByteArrayOutputStream;
            import java.io.File;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class O111ooi11li implements O11il1ilio1o {
                public static final O111ooi11li I00000oIO = new O111ooi11li();
                public static final LinkedHashMap I00000oOI = new LinkedHashMap();

                public static Contents I000OOo1O(O1oIOiI11o0 o1oIOiI11o0, Contents contents) {
/* 1 */             if (contents != null) {
/* 3 */                 return contents;
                    }
/* 4 */             o1oIOiI11o0.getClass();
/* 23 */            String str = (String) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("Accelerator", ""), ValueType.STRING);
/* 35 */            if ((str.equals(Accelerator.NPU.getLabel()) || str.equals(Accelerator.TPU.getLabel())) && OlOoOIi0o.I000oI1ioi(o1oIOiI11o0.I00000oIO, "Gemma 3 1B", true)) {
/* 64 */                return Contents.INSTANCE.of("Be brief and concise, and do not repeat words or phrases.");
                    }
/* 69 */            return null;
                }

                public static String I000iOII(Context context) throws IOException, ErrnoException {
/* 7 */             String str = context.getApplicationInfo().nativeLibraryDir;
/* 9 */             String str2 = IOo1Oilol.I0000O;
/* 18 */            if (OlOoOIi0o.I000oI1ioi(str2, "tensor", false)) {
/* 20 */                return str;
                    }
                    try {
/* 35 */                String str3 = OlOolloIIOl0.I000l1(str2, "mt", false) ? "libLiteRtDispatch_MediaTek.so" : "libLiteRtDispatch_Qualcomm.so";
/* 45 */                File file = new File(context.getNoBackupFilesDir(), "npu_dispatch");
/* 48 */                IlIl10.I0000O(file);
/* 55 */                if (!file.mkdirs()) {
/* 147 */                   throw new IOException("could not create " + file);
                        }
/* 62 */                File[] fileArrListFiles = new File(str).listFiles();
/* 66 */                if (fileArrListFiles != null) {
/* 70 */                    for (File file2 : fileArrListFiles) {
/* 74 */                        String name = file2.getName();
/* 84 */                        if (!OlOolloIIOl0.I000l1(name, "libLiteRtDispatch_", false) || !OlOolloIIOl0.I000II(name, ".so", false) || name.equals(str3)) {
/* 114 */                           Os.symlink(file2.getAbsolutePath(), new File(file, name).getAbsolutePath());
                                }
                            }
                        }
/* 120 */               List list = IOo1Oilol.I00000oIO;
/* 122 */               file.getAbsolutePath();
/* 125 */               return file.getAbsolutePath();
                    } catch (Exception e) {
/* 164 */               Log.w("AGLlmChatModelHelper", "Failed to build filtered NPU dispatch dir; using " + str, e);
/* 168 */               return str;
                    }
                }

                public static void I000l1(O1oIOiI11o0 o1oIOiI11o0, List list, String str) {
/* 21 */            String str2 = (String) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("Accelerator", ""), ValueType.STRING);
/* 33 */            if (str2.equals(Accelerator.NPU.getLabel()) || str2.equals(Accelerator.TPU.getLabel())) {
/* 49 */                String str3 = IOo1Oilol.I0000O;
/* 72 */                boolean z = OlOolloIIOl0.I000l1(str3, "sm", false) || OlOolloIIOl0.I000l1(str3, "qcs", false);
/* 75 */                boolean zI000l1 = OlOolloIIOl0.I000l1(str3, "mt", false);
/* 79 */                if (z || zI000l1) {
/* 85 */                    Object obj = o1oIOiI11o0.I00IlilI0i0i;
/* 95 */                    O11illi o11illi = obj instanceof O11illi ? (O11illi) obj : null;
/* 96 */                    if (o11illi == null) {
/* 408 */                       return;
                            }
/* 133 */                   int iIntValue = (int) (((Integer) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("Max tokens", Integer.valueOf(Barcode.FORMAT_UPC_E)), ValueType.INT)).intValue() * 0.6d);
/* 140 */                   int length = (str.length() / 4) + 6;
/* 142 */                   if (zI000l1) {
/* 151 */                       if (list.isEmpty()) {
/* 408 */                           return;
                                }
                            } else if (I000lI(length, iIntValue, list)) {
/* 408 */                       return;
                            }
/* 160 */                   List listI001iOo1i0O = list;
/* 168 */                   while (!listI001iOo1i0O.isEmpty() && !I000lI(length, iIntValue, listI001iOo1i0O)) {
/* 178 */                       listI001iOo1i0O = IOOi0Ool1i.I001iOo1i0O(listI001iOo1i0O, 1);
                            }
                            try {
/* 184 */                       List<OIoi0IIoi> list2 = listI001iOo1i0O;
/* 194 */                       ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 205 */                       for (OIoi0IIoi oIoi0IIoi : list2) {
/* 217 */                           boolean zBooleanValue = ((Boolean) oIoi0IIoi.I00iOIl).booleanValue();
/* 223 */                           String str4 = (String) oIoi0IIoi.I00iiI;
/* 240 */                           arrayList.add(zBooleanValue ? Message.INSTANCE.user(str4) : Message.INSTANCE.model(str4));
                                }
/* 263 */                       Conversation conversationCreateConversation = o11illi.I00000oIO.createConversation(new ConversationConfig(o11illi.I0000Il00O, arrayList, o11illi.I0000O, null, false, null, null, 112, null));
/* 269 */                       o11illi.I00000oOI.close();
/* 278 */                       o1oIOiI11o0.I00IlilI0i0i = O11illi.I00000oIO(o11illi, conversationCreateConversation, null, null, 13);
/* 280 */                       listI001iOo1i0O.size();
/* 283 */                       list.size();
                            } catch (Exception e) {
/* 292 */                       Log.w("AGLlmChatModelHelper", "NPU window slide failed; continuing without it", e);
                            }
                        }
                    }
                }

                public static final boolean I000lI(int i, int i2, List list) {
/* 3 */             Iterator it = list.iterator();
/* 8 */             int length = 0;
/* 13 */            while (it.hasNext()) {
/* 33 */                length += (((String) ((OIoi0IIoi) it.next()).I00iiI).length() / 4) + 6;
                    }
                    return length + i <= i2;
                }

                @Override
                public final void I00000oIO(O1oIOiI11o0 o1oIOiI11o0, IllOOo00lI illOOo00lI) {
/* 3 */             Object obj = o1oIOiI11o0.I00IlilI0i0i;
/* 5 */             if (obj == null) {
/* 7 */                 return;
                    }
/* 8 */             O11illi o11illi = (O11illi) obj;
                    try {
/* 12 */                o11illi.I00000oOI.close();
                    } catch (Exception e) {
/* 23 */                IIlIOloOOO.I001iOo1i0O("Failed to close the conversation: ", e.getMessage(), "AGLlmChatModelHelper");
                    }
                    try {
/* 28 */                o11illi.I00000oIO.close();
                    } catch (Exception e2) {
/* 39 */                IIlIOloOOO.I001iOo1i0O("Failed to close the engine: ", e2.getMessage(), "AGLlmChatModelHelper");
                    }
/* 50 */            IllOOo00lI illOOo00lI2 = (IllOOo00lI) I00000oOI.remove(o1oIOiI11o0.I00000oIO);
/* 52 */            if (illOOo00lI2 != null) {
/* 54 */                illOOo00lI2.invoke();
                    }
/* 58 */            o1oIOiI11o0.I00IlilI0i0i = null;
/* 60 */            illOOo00lI.invoke();
                }

                @Override
                public final void I0000Il00O(O1oIOiI11o0 o1oIOiI11o0, Contents contents, List list, boolean z) {
                    try {
/* 1 */                 Contents contentsI000OOo1O = I000OOo1O(o1oIOiI11o0, contents);
/* 7 */                 O11illi o11illi = (O11illi) o1oIOiI11o0.I00IlilI0i0i;
/* 9 */                 if (o11illi == null) {
/* 204 */                   return;
                        }
/* 15 */                o11illi.I00000oOI.close();
/* 18 */                Engine engine = o11illi.I00000oIO;
/* 42 */                int iIntValue = ((Integer) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("TopK", 64), ValueType.INT)).intValue();
/* 69 */                float fFloatValue = ((Float) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("TopP", Float.valueOf(0.95f)), ValueType.FLOAT)).floatValue();
/* 95 */                float fFloatValue2 = ((Float) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("Temperature", Float.valueOf(1.0f)), ValueType.FLOAT)).floatValue();
/* 119 */               String str = (String) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("Accelerator", Accelerator.GPU.getLabel()), ValueType.STRING);
/* 121 */               ExperimentalFlags experimentalFlags = ExperimentalFlags.INSTANCE;
/* 123 */               experimentalFlags.setEnableConversationConstrainedDecoding(z);
/* 181 */               Conversation conversationCreateConversation = engine.createConversation(new ConversationConfig(contentsI000OOo1O, null, list, (str.equals(Accelerator.NPU.getLabel()) || str.equals(Accelerator.TPU.getLabel())) ? null : new SamplerConfig(iIntValue, fFloatValue, fFloatValue2, (int) System.currentTimeMillis()), false, null, null, 114, null));
/* 186 */               experimentalFlags.setEnableConversationConstrainedDecoding(false);
/* 194 */               o1oIOiI11o0.I00IlilI0i0i = O11illi.I00000oIO(o11illi, conversationCreateConversation, contentsI000OOo1O, list, 1);
                    } catch (Exception unused) {
                    }
                }

                /* JADX WARN: Can't wrap try/catch for region: R(23:(28:48|(1:50)|51|54|292|55|284|56|290|57|(1:70)(1:69)|71|274|72|(1:74)(8:75|76|286|77|78|294|79|80)|81|82|276|83|84|280|85|86|282|87|88|256|257)(1:53)|284|56|290|57|(2:67|70)(0)|71|274|72|(0)(0)|81|82|276|83|84|280|85|86|282|87|88|256|257) */
                /* JADX WARN: Can't wrap try/catch for region: R(41:0|2|(1:4)(2:6|(1:8)(2:9|(1:15)(1:14)))|5|16|(1:18)(2:20|(1:22)(2:23|(1:29)(1:28)))|19|30|(2:32|(1:34)(1:35))(1:36)|37|(2:39|(1:44)(1:43))(1:45)|46|(28:48|(1:50)|51|54|292|55|284|56|290|57|(1:70)(1:69)|71|274|72|(1:74)(8:75|76|286|77|78|294|79|80)|81|82|276|83|84|280|85|86|282|87|88|256|257)(1:53)|52|51|54|292|55|284|56|290|57|(2:67|70)(0)|71|274|72|(0)(0)|81|82|276|83|84|280|85|86|282|87|88|256|257|(3:(0)|(1:289)|(1:293))) */
                /* JADX WARN: Code restructure failed: missing block: B:100:0x028a, code lost:
                
                    r36 = r12;
                    r12 = r22;
                    r7 = r7;
                    r1 = r8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:103:0x02a5, code lost:
                
                    r9 = r45.getMessage();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:104:0x02a9, code lost:
                
                    if (r9 != null) goto L105;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:105:0x02ab, code lost:
                
                    r10 = 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:106:0x02b3, code lost:
                
                    if (p000.OlOoOIi0o.I000oI1ioi(r9, "TF_LITE_AUX", false) == true) goto L107;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:107:0x02b5, code lost:
                
                    r9 = "TF_LITE_AUX not found";
                 */
                /* JADX WARN: Code restructure failed: missing block: B:108:0x02b8, code lost:
                
                    r10 = 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:109:0x02b9, code lost:
                
                    r9 = p000.IIl001iO0Io.I000o00OoI0I("init error: ", r45.getMessage());
                 */
                /* JADX WARN: Code restructure failed: missing block: B:110:0x02c3, code lost:
                
                    r13 = com.google.ai.edge.gallery.data.Accelerator.GPU;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:111:0x02cb, code lost:
                
                    if (r6.contains(r13) != false) goto L114;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:112:0x02cd, code lost:
                
                    android.util.Log.w("AGLlmChatModelHelper", "NPU init failed (" + r9 + "); model is NPU-only, no GPU fallback possible");
                    r41.invoke("This NPU build of \"" + r5 + "\" couldn't start on this device's NPU — the device's NPU firmware may be incompatible with it. Install the standard \"Gemma-4-E2B-it\" model instead, which runs on GPU.");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:113:0x02f7, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:114:0x02f8, code lost:
                
                    android.util.Log.w("AGLlmChatModelHelper", "NPU init failed (" + r9 + "), retrying with GPU");
                    r19 = r7;
                    r9 = new com.google.ai.edge.litertlm.Backend.GPU();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:115:0x0315, code lost:
                
                    if (r39 != false) goto L116;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:116:0x0317, code lost:
                
                    r15 = new com.google.ai.edge.litertlm.Backend.GPU();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:117:0x031d, code lost:
                
                    r15 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:118:0x031e, code lost:
                
                    if (r40 != false) goto L119;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:119:0x0320, code lost:
                
                    r5 = null;
                    r0 = new com.google.ai.edge.litertlm.Backend.CPU(null, r10, null);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:121:0x032a, code lost:
                
                    r5 = null;
                    r0 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:123:0x0331, code lost:
                
                    if (p000.OlOolloIIOl0.I000l1(r10, "/data/local/tmp", false) == false) goto L127;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:126:0x033b, code lost:
                
                    r14 = r6.getAbsolutePath();
                    r10 = r15;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:127:0x0342, code lost:
                
                    r10 = r15;
                    r14 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:128:0x0344, code lost:
                
                    r22 = r12;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:129:0x0357, code lost:
                
                    r8 = new com.google.ai.edge.litertlm.Engine(new com.google.ai.edge.litertlm.EngineConfig(r10, r9, r10, r0, r36, null, r14, 32, null));
                    r8.initialize();
                    r11.setEnableConversationConstrainedDecoding(r44);
                    r1 = r8.createConversation(new com.google.ai.edge.litertlm.ConversationConfig(r22, null, r43, new com.google.ai.edge.litertlm.SamplerConfig(r17, r19, r1, 0, 8, null), false, null, null, 114, null));
                    r11.setEnableConversationConstrainedDecoding(false);
                    r38.I00IlilI0i0i = new p000.O11illi(r8, r1);
                    r1 = new java.util.LinkedHashMap(r38.I00IoIO0lI);
                    r1.put("Accelerator", r13.getLabel());
                    r38.I00IoIO0lI = r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:131:0x03ae, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:132:0x03af, code lost:
                
                    r0 = r0.getMessage();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:133:0x03b3, code lost:
                
                    if (r0 != null) goto L135;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:135:0x03b6, code lost:
                
                    r32 = r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:136:0x03b8, code lost:
                
                    r41.invoke(p000.li10oO000.I00000oIO(r32));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:137:0x03bf, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:138:0x03c0, code lost:
                
                    r19 = r7;
                    r22 = r12;
                    r12 = r36;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:139:0x03d1, code lost:
                
                    if (r10 == false) goto L169;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:143:0x03e5, code lost:
                
                    if (p000.OlOoOIi0o.I000oI1ioi(r10, "MTP drafter", false) == true) goto L144;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:144:0x03e7, code lost:
                
                    android.util.Log.w("AGLlmChatModelHelper", "MTP drafter requires CPU backend, retrying with CPU");
                    r9 = new com.google.ai.edge.litertlm.Backend.CPU(null, 1, null);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:145:0x03f4, code lost:
                
                    if (r39 != false) goto L146;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:146:0x03f6, code lost:
                
                    r10 = new com.google.ai.edge.litertlm.Backend.CPU(null, 1, null);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:147:0x03fd, code lost:
                
                    r10 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:148:0x03fe, code lost:
                
                    if (r40 != false) goto L149;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:149:0x0400, code lost:
                
                    r15 = new com.google.ai.edge.litertlm.Backend.CPU(null, 1, null);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:151:0x0407, code lost:
                
                    r15 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:153:0x040d, code lost:
                
                    if (p000.OlOolloIIOl0.I000l1(r10, "/data/local/tmp", false) == false) goto L157;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:156:0x0415, code lost:
                
                    r14 = r5.getAbsolutePath();
                    r5 = r11;
                    r8 = r10;
                    r11 = r15;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:157:0x041f, code lost:
                
                    r8 = r10;
                    r5 = r11;
                    r11 = r15;
                    r14 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:158:0x0423, code lost:
                
                    r0 = r5;
                    r0 = new com.google.ai.edge.litertlm.EngineConfig(r8, r9, r10, r11, r12, null, r14, 32, null);
                    r0.setEnableSpeculativeDecoding(java.lang.Boolean.TRUE);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:159:0x043a, code lost:
                
                    r8 = new com.google.ai.edge.litertlm.Engine(r0);
                    r8.initialize();
                    r0.setEnableSpeculativeDecoding(r13);
                    r0.setEnableConversationConstrainedDecoding(r44);
                    r1 = r8.createConversation(new com.google.ai.edge.litertlm.ConversationConfig(r22, null, r43, new com.google.ai.edge.litertlm.SamplerConfig(r17, r19, r1, 0, 8, null), false, null, null, 114, null));
                    r0.setEnableConversationConstrainedDecoding(false);
                    r38.I00IlilI0i0i = new p000.O11illi(r8, r1);
                    r1 = new java.util.LinkedHashMap(r38.I00IoIO0lI);
                    r1.put("Accelerator", com.google.ai.edge.gallery.data.Accelerator.CPU.getLabel());
                    r38.I00IoIO0lI = r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:160:0x0492, code lost:
                
                    r5 = r41;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:161:0x0496, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:162:0x0497, code lost:
                
                    com.google.ai.edge.litertlm.ExperimentalFlags.INSTANCE.setEnableSpeculativeDecoding(java.lang.Boolean.FALSE);
                    r0 = r0.getMessage();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:163:0x04a2, code lost:
                
                    if (r0 != null) goto L165;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:165:0x04a5, code lost:
                
                    r32 = r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:166:0x04a7, code lost:
                
                    r41.invoke(p000.li10oO000.I00000oIO(r32));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:167:0x04b0, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:168:0x04b1, code lost:
                
                    r12 = r12;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:170:0x04b6, code lost:
                
                    if (r40 != false) goto L171;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:173:0x04be, code lost:
                
                    r36 = r12;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:174:0x04c8, code lost:
                
                    if (p000.OlOoOIi0o.I000oI1ioi(r13, "TF_LITE_AUDIO_ADAPTER", false) == true) goto L175;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:175:0x04ca, code lost:
                
                    android.util.Log.w("AGLlmChatModelHelper", "Audio adapter missing for '" + r5 + "', retrying on " + r9 + " without audio");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:176:0x04ea, code lost:
                
                    if (r39 != false) goto L177;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:177:0x04ec, code lost:
                
                    if (r15 != false) goto L178;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:178:0x04ee, code lost:
                
                    r10 = r9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:180:0x04f1, code lost:
                
                    r10 = r20;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:181:0x04f4, code lost:
                
                    r10 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:183:0x04fa, code lost:
                
                    if (p000.OlOolloIIOl0.I000l1(r10, "/data/local/tmp", false) == false) goto L187;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:186:0x0503, code lost:
                
                    r15 = r3.getAbsolutePath();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:187:0x0508, code lost:
                
                    r15 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:188:0x0509, code lost:
                
                    r5 = r41;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:189:0x051d, code lost:
                
                    r6 = new com.google.ai.edge.litertlm.Engine(new com.google.ai.edge.litertlm.EngineConfig(r10, r9, r10, null, r36, null, r15, 32, null));
                    r6.initialize();
                    r11.setEnableConversationConstrainedDecoding(r44);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:190:0x052a, code lost:
                
                    if ((r9 instanceof com.google.ai.edge.litertlm.Backend.NPU) != false) goto L191;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:191:0x052c, code lost:
                
                    r25 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:192:0x052f, code lost:
                
                    r25 = new com.google.ai.edge.litertlm.SamplerConfig(r17, r19, r1, 0, 8, null);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:193:0x0543, code lost:
                
                    r1 = r6.createConversation(new com.google.ai.edge.litertlm.ConversationConfig(r22, null, r43, r25, false, null, null, 114, null));
                    r11.setEnableConversationConstrainedDecoding(false);
                    r38.I00IlilI0i0i = new p000.O11illi(r6, r1);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:195:0x0569, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:196:0x056a, code lost:
                
                    r0 = r0.getMessage();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:197:0x056e, code lost:
                
                    if (r0 != null) goto L199;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:199:0x0571, code lost:
                
                    r32 = r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:200:0x0573, code lost:
                
                    r5.invoke(p000.li10oO000.I00000oIO(r32));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:201:0x057a, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:202:0x057b, code lost:
                
                    r12 = r36;
                    r5 = r41;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:203:0x0580, code lost:
                
                    r5 = r41;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:205:0x0583, code lost:
                
                    if ((r9 instanceof com.google.ai.edge.litertlm.Backend.GPU) == false) goto L233;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:206:0x0585, code lost:
                
                    r10 = com.google.ai.edge.gallery.data.Accelerator.CPU;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:207:0x058b, code lost:
                
                    if (r6.contains(r10) != false) goto L208;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:208:0x058d, code lost:
                
                    android.util.Log.w("AGLlmChatModelHelper", "GPU init failed (" + r45.getMessage() + "), retrying with CPU");
                    r9 = new com.google.ai.edge.litertlm.Backend.CPU(null, 1, null);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:209:0x05b0, code lost:
                
                    if (r39 != false) goto L210;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:210:0x05b2, code lost:
                
                    r10 = new com.google.ai.edge.litertlm.Backend.CPU(null, 1, null);
                    r6 = r10;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:211:0x05bd, code lost:
                
                    r6 = r10;
                    r10 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:213:0x05c1, code lost:
                
                    if (r40 != false) goto L214;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:214:0x05c3, code lost:
                
                    r15 = new com.google.ai.edge.litertlm.Backend.CPU(null, 1, null);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:216:0x05cb, code lost:
                
                    r15 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:218:0x05d1, code lost:
                
                    if (p000.OlOolloIIOl0.I000l1(r10, "/data/local/tmp", false) == false) goto L222;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:221:0x05da, code lost:
                
                    r14 = r0.getAbsolutePath();
                    r0 = r11;
                    r8 = r10;
                    r11 = r15;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:222:0x05e4, code lost:
                
                    r8 = r10;
                    r0 = r11;
                    r11 = r15;
                    r14 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:223:0x05e8, code lost:
                
                    r31 = r6;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:224:0x05f6, code lost:
                
                    r8 = new com.google.ai.edge.litertlm.Engine(new com.google.ai.edge.litertlm.EngineConfig(r8, r9, r10, r11, r12, null, r14, 32, null));
                    r8.initialize();
                    r0.setEnableConversationConstrainedDecoding(r44);
                    r1 = r8.createConversation(new com.google.ai.edge.litertlm.ConversationConfig(r22, null, r43, new com.google.ai.edge.litertlm.SamplerConfig(r17, r19, r1, 0, 8, null), false, null, null, 114, null));
                    r0.setEnableConversationConstrainedDecoding(false);
                    r38.I00IlilI0i0i = new p000.O11illi(r8, r1);
                    r1 = new java.util.LinkedHashMap(r38.I00IoIO0lI);
                    r1.put("Accelerator", r31.getLabel());
                    r38.I00IoIO0lI = r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:226:0x064b, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:227:0x064c, code lost:
                
                    r0 = r0.getMessage();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:228:0x0650, code lost:
                
                    if (r0 != null) goto L230;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:230:0x0653, code lost:
                
                    r32 = r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:231:0x0655, code lost:
                
                    r5.invoke(p000.li10oO000.I00000oIO(r32));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:232:0x065c, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:234:0x0660, code lost:
                
                    if (r39 != false) goto L243;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:237:0x0665, code lost:
                
                    r0 = r45.getMessage();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:238:0x0669, code lost:
                
                    if (r0 != null) goto L240;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:240:0x066c, code lost:
                
                    r32 = r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:241:0x066e, code lost:
                
                    r5.invoke(p000.li10oO000.I00000oIO(r32));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:242:0x0675, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:243:0x0676, code lost:
                
                    android.util.Log.w("AGLlmChatModelHelper", "Engine init failed with modalities enabled (" + r45.getMessage() + "), retrying text-only on " + r9);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:244:0x069a, code lost:
                
                    if (p000.OlOolloIIOl0.I000l1(r10, "/data/local/tmp", false) != false) goto L245;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:245:0x069c, code lost:
                
                    r7 = null;
                    r8 = r37.getExternalFilesDir(null);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:246:0x06a1, code lost:
                
                    if (r8 != null) goto L247;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:247:0x06a3, code lost:
                
                    r14 = r8.getAbsolutePath();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:248:0x06a9, code lost:
                
                    r14 = r7;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:249:0x06ab, code lost:
                
                    r7 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:250:0x06ad, code lost:
                
                    r31 = r7;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:251:0x06bb, code lost:
                
                    r0 = new com.google.ai.edge.litertlm.Engine(new com.google.ai.edge.litertlm.EngineConfig(r10, r9, null, null, r12, null, r14, 32, null));
                    r0.initialize();
                    r11.setEnableConversationConstrainedDecoding(r44);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:252:0x06c8, code lost:
                
                    if ((r9 instanceof com.google.ai.edge.litertlm.Backend.NPU) == false) goto L254;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:253:0x06ca, code lost:
                
                    r25 = r31;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:254:0x06cd, code lost:
                
                    r25 = new com.google.ai.edge.litertlm.SamplerConfig(r17, r19, r1, 0, 8, null);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:255:0x06e1, code lost:
                
                    r1 = r0.createConversation(new com.google.ai.edge.litertlm.ConversationConfig(r22, null, r43, r25, false, null, null, 114, null));
                    r11.setEnableConversationConstrainedDecoding(false);
                    r38.I00IlilI0i0i = new p000.O11illi(r0, r1);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:258:0x070b, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:259:0x070c, code lost:
                
                    r0 = r0.getMessage();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:260:0x0710, code lost:
                
                    if (r0 != null) goto L262;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:262:0x0713, code lost:
                
                    r32 = r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:263:0x0715, code lost:
                
                    r5.invoke(p000.li10oO000.I00000oIO(r32));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:264:0x071c, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:65:0x01da, code lost:
                
                    r13 = false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:89:0x0271, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:91:0x0273, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:93:0x0277, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:94:0x0278, code lost:
                
                    r12 = r22;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:99:0x0289, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:103:0x02a5  */
                /* JADX WARN: Removed duplicated region for block: B:112:0x02cd  */
                /* JADX WARN: Removed duplicated region for block: B:114:0x02f8  */
                /* JADX WARN: Removed duplicated region for block: B:138:0x03c0  */
                /* JADX WARN: Removed duplicated region for block: B:203:0x0580  */
                /* JADX WARN: Removed duplicated region for block: B:206:0x0585  */
                /* JADX WARN: Removed duplicated region for block: B:233:0x065d  */
                /* JADX WARN: Removed duplicated region for block: B:253:0x06ca  */
                /* JADX WARN: Removed duplicated region for block: B:254:0x06cd A[Catch: Exception -> 0x070b, TryCatch #1 {Exception -> 0x070b, blocks: (B:251:0x06bb, B:255:0x06e1, B:254:0x06cd), top: B:268:0x06bb }] */
                /* JADX WARN: Removed duplicated region for block: B:70:0x01f9  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x021a  */
                /* JADX WARN: Removed duplicated region for block: B:75:0x0223 A[Catch: Exception -> 0x0289, TRY_LEAVE, TryCatch #4 {Exception -> 0x0289, blocks: (B:72:0x01fd, B:75:0x0223), top: B:274:0x01fd }] */
                /* JADX WARN: Type inference failed for: r21v0, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r25v0 */
                /* JADX WARN: Type inference failed for: r25v1, types: [com.google.ai.edge.litertlm.SamplerConfig] */
                /* JADX WARN: Type inference failed for: r25v2 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000O(Context context, O1oIOiI11o0 o1oIOiI11o0, boolean z, boolean z2, Function1 function1, Contents contents, List list, boolean z3, Ii0110 ii0110) {
                    String str;
                    String absolutePath;
                    Integer num;
                    Contents contents2;
                    float f;
                    float f2;
                    boolean z4;
                    SamplerConfig samplerConfig;
/* 9 */             String str2 = o1oIOiI11o0.I00000oIO;
/* 11 */            List list2 = o1oIOiI11o0.I00IO1;
/* 34 */            Integer num2 = (Integer) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("Max tokens", Integer.valueOf(Barcode.FORMAT_UPC_E)), ValueType.INT);
/* 58 */            int iIntValue = ((Integer) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("TopK", 64), ValueType.INT)).intValue();
/* 85 */            float fFloatValue = ((Float) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("TopP", Float.valueOf(0.95f)), ValueType.FLOAT)).floatValue();
/* 111 */           float fFloatValue2 = ((Float) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("Temperature", Float.valueOf(1.0f)), ValueType.FLOAT)).floatValue();
/* 115 */           Accelerator accelerator = Accelerator.GPU;
/* 135 */           String str3 = (String) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("Accelerator", accelerator.getLabel()), ValueType.STRING);
/* 157 */           String str4 = (String) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("Vision accelerator", IOo1Oilol.I00000oOI.getLabel()), ValueType.STRING);
/* 163 */           I000OOo1O i000OOo1O = new I000OOo1O(8);
/* 166 */           i000OOo1O.I00iiI = context;
/* 168 */           VarHandle.storeStoreFence();
/* 173 */           OllO00oiil ollO00oiil = new OllO00oiil(i000OOo1O);
/* 176 */           Accelerator accelerator2 = Accelerator.CPU;
/* 257 */           Backend cpu = str4.equals(accelerator2.getLabel()) ? new Backend.CPU(null, 1, null) : str4.equals(accelerator.getLabel()) ? new Backend.GPU() : (str4.equals(Accelerator.NPU.getLabel()) || str4.equals(Accelerator.TPU.getLabel())) ? new Backend.NPU((String) ollO00oiil.getValue()) : new Backend.GPU();
/* 335 */           Backend cpu2 = str3.equals(accelerator2.getLabel()) ? new Backend.CPU(null, 1, null) : str3.equals(accelerator.getLabel()) ? new Backend.GPU() : (str3.equals(Accelerator.NPU.getLabel()) || str3.equals(Accelerator.TPU.getLabel())) ? new Backend.NPU((String) ollO00oiil.getValue()) : new Backend.CPU(null, 1, null);
/* 339 */           cpu2.toString();
/* 344 */           Contents contentsI000OOo1O = I000OOo1O(o1oIOiI11o0, contents);
/* 350 */           String strI00000oOI = o1oIOiI11o0.I00000oOI(context, o1oIOiI11o0.I000OiO);
/* 368 */           Backend backend = z ? cpu2 instanceof Backend.NPU ? cpu2 : cpu : null;
/* 398 */           Backend cpu3 = z2 ? ((cpu2 instanceof Backend.NPU) && OlOoOIi0o.I000oI1ioi(IOo1Oilol.I0000O, "tensor", false)) ? cpu2 : new Backend.CPU(null, 1, null) : null;
                    try {
/* 406 */               if (OlOolloIIOl0.I000l1(strI00000oOI, "/data/local/tmp", false)) {
/* 408 */                   str = null;
/* 409 */                   File externalFilesDir = context.getExternalFilesDir(null);
/* 413 */                   if (externalFilesDir != null) {
/* 415 */                       absolutePath = externalFilesDir.getAbsolutePath();
                            }
/* 436 */                   ?? r21 = str;
/* 451 */                   EngineConfig engineConfig = new EngineConfig(strI00000oOI, cpu2, backend, cpu3, num2, null, absolutePath, 32, null);
/* 456 */                   Capabilities capabilities = new Capabilities(strI00000oOI);
/* 459 */                   boolean zHasSpeculativeDecodingSupport = capabilities.hasSpeculativeDecodingSupport();
/* 463 */                   iOOl00.I00000oIO(capabilities, r21);
/* 506 */                   boolean zBooleanValue = (zHasSpeculativeDecodingSupport || (cpu2 instanceof Backend.NPU)) ? false : ((Boolean) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("Enable speculative decoding", Boolean.FALSE), ValueType.BOOLEAN)).booleanValue();
/* 507 */                   cpu2.toString();
/* 510 */                   ExperimentalFlags experimentalFlags = ExperimentalFlags.INSTANCE;
/* 516 */                   experimentalFlags.setEnableSpeculativeDecoding(Boolean.valueOf(zBooleanValue));
/* 521 */                   Engine engine = new Engine(engineConfig);
/* 524 */                   engine.initialize();
/* 529 */                   experimentalFlags.setEnableSpeculativeDecoding(Boolean.FALSE);
/* 532 */                   experimentalFlags.setEnableConversationConstrainedDecoding(z3);
/* 537 */                   if (cpu2 instanceof Backend.NPU) {
/* 550 */                       f = fFloatValue;
/* 553 */                       num = num2;
/* 557 */                       f2 = fFloatValue2;
                                try {
                                } catch (Exception e) {
/* 638 */                           e = e;
/* 641 */                           contents2 = contentsI000OOo1O;
/* 661 */                           ExperimentalFlags experimentalFlags2 = ExperimentalFlags.INSTANCE;
/* 663 */                           Boolean bool = Boolean.FALSE;
/* 665 */                           experimentalFlags2.setEnableSpeculativeDecoding(bool);
/* 668 */                           z4 = cpu2 instanceof Backend.NPU;
/* 670 */                           String str5 = "Unknown error";
/* 672 */                           Exception exc = e;
/* 676 */                           if (!z4) {
                                    }
                                }
                                try {
/* 576 */                           SamplerConfig samplerConfig2 = new SamplerConfig(iIntValue, f, f2, (int) System.currentTimeMillis());
/* 579 */                           iIntValue = iIntValue;
/* 581 */                           samplerConfig = samplerConfig2;
                                } catch (Exception e2) {
/* 644 */                           e = e2;
/* 645 */                           iIntValue = iIntValue;
/* 647 */                           contents2 = contentsI000OOo1O;
/* 661 */                           ExperimentalFlags experimentalFlags22 = ExperimentalFlags.INSTANCE;
/* 663 */                           Boolean bool2 = Boolean.FALSE;
/* 665 */                           experimentalFlags22.setEnableSpeculativeDecoding(bool2);
/* 668 */                           z4 = cpu2 instanceof Backend.NPU;
/* 670 */                           String str52 = "Unknown error";
/* 672 */                           Exception exc2 = e;
/* 676 */                           if (!z4) {
                                    }
                                }
                            } else {
/* 539 */                       samplerConfig = r21;
/* 541 */                       num = num2;
/* 543 */                       f = fFloatValue;
/* 545 */                       f2 = fFloatValue2;
                            }
/* 604 */                   contents2 = contentsI000OOo1O;
/* 606 */                   Conversation conversationCreateConversation = engine.createConversation(new ConversationConfig(contentsI000OOo1O, null, list, samplerConfig, false, null, null, 114, null));
/* 611 */                   experimentalFlags.setEnableConversationConstrainedDecoding(false);
/* 621 */                   o1oIOiI11o0.I00IlilI0i0i = new O11illi(engine, conversationCreateConversation, contents2, list);
/* 623 */                   Function1 function12 = function1;
/* 1800 */                  function12.invoke("");
/* 1803 */                  return;
                        }
/* 425 */               str = null;
/* 459 */               boolean zHasSpeculativeDecodingSupport2 = capabilities.hasSpeculativeDecodingSupport();
/* 463 */               iOOl00.I00000oIO(capabilities, r21);
/* 506 */               if (zHasSpeculativeDecodingSupport2) {
                        }
/* 507 */               cpu2.toString();
/* 510 */               ExperimentalFlags experimentalFlags3 = ExperimentalFlags.INSTANCE;
/* 516 */               experimentalFlags3.setEnableSpeculativeDecoding(Boolean.valueOf(zBooleanValue));
/* 521 */               Engine engine2 = new Engine(engineConfig);
/* 524 */               engine2.initialize();
/* 529 */               experimentalFlags3.setEnableSpeculativeDecoding(Boolean.FALSE);
/* 532 */               experimentalFlags3.setEnableConversationConstrainedDecoding(z3);
/* 537 */               if (cpu2 instanceof Backend.NPU) {
                        }
/* 604 */               contents2 = contentsI000OOo1O;
/* 606 */               Conversation conversationCreateConversation2 = engine2.createConversation(new ConversationConfig(contentsI000OOo1O, null, list, samplerConfig, false, null, null, 114, null));
/* 611 */               experimentalFlags3.setEnableConversationConstrainedDecoding(false);
/* 621 */               o1oIOiI11o0.I00IlilI0i0i = new O11illi(engine2, conversationCreateConversation2, contents2, list);
/* 623 */               Function1 function122 = function1;
/* 1800 */              function122.invoke("");
/* 1803 */              return;
                    } finally {
                    }
/* 422 */           absolutePath = str;
/* 436 */           ?? r212 = str;
/* 451 */           EngineConfig engineConfig2 = new EngineConfig(strI00000oOI, cpu2, backend, cpu3, num2, null, absolutePath, 32, null);
/* 456 */           Capabilities capabilities2 = new Capabilities(strI00000oOI);
                }

                @Override
                public final void I0000oI00(O1oIOiI11o0 o1oIOiI11o0) {
/* 1 */             Object obj = o1oIOiI11o0.I00IlilI0i0i;
/* 10 */            O11illi o11illi = obj instanceof O11illi ? (O11illi) obj : null;
/* 11 */            if (o11illi == null) {
/* 13 */                return;
                    }
/* 16 */            o11illi.I00000oOI.cancelProcess();
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final void I0001Ioi1lo(O1oIOiI11o0 o1oIOiI11o0, String str, Function3 function3, IllOOo00lI illOOo00lI, Function1 function1, List list, List list2, Ii0110 ii0110, Map map) {
/* 1 */             String str2 = o1oIOiI11o0.I00000oIO;
/* 3 */             Object obj = o1oIOiI11o0.I00IlilI0i0i;
/* 13 */            O11illi o11illi = obj instanceof O11illi ? (O11illi) obj : null;
/* 14 */            if (o11illi == null) {
/* 18 */                function1.invoke("LlmModelInstance is not initialized.");
/* 21 */                return;
                    }
/* 22 */            LinkedHashMap linkedHashMap = I00000oOI;
/* 28 */            if (!linkedHashMap.containsKey(str2)) {
/* 30 */                linkedHashMap.put(str2, illOOo00lI);
                    }
/* 33 */            Conversation conversation = o11illi.I00000oOI;
/* 37 */            ArrayList arrayList = new ArrayList();
/* 40 */            Iterator it = list.iterator();
/* 48 */            while (it.hasNext()) {
/* 54 */                Bitmap bitmap = (Bitmap) it.next();
/* 60 */                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 67 */                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
/* 77 */                arrayList.add(new Content.ImageBytes(byteArrayOutputStream.toByteArray()));
                    }
/* 81 */            Iterator it2 = list2.iterator();
/* 89 */            while (it2.hasNext()) {
/* 102 */               arrayList.add(new Content.AudioBytes((byte[]) it2.next()));
                    }
/* 118 */           if (OlOoOIi0o.I00OIo(str).toString().length() > 0) {
/* 125 */               arrayList.add(new Content.Text(str));
                    }
/* 144 */           String str3 = (String) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("Accelerator", ""), ValueType.STRING);
/* 156 */           boolean z = false;
/* 157 */           if (str3.equals(Accelerator.NPU.getLabel()) || str3.equals(Accelerator.TPU.getLabel())) {
/* 172 */               String str4 = IOo1Oilol.I0000O;
/* 180 */               if (OlOolloIIOl0.I000l1(str4, "sm", false) || OlOolloIIOl0.I000l1(str4, "qcs", false) || OlOolloIIOl0.I000l1(str4, "mt", false)) {
/* 198 */                   z = true;
                        }
                    }
/* 203 */           StringBuilder sb = z ? new StringBuilder() : null;
/* 208 */           OOo0l0ii10l oOo0l0ii10l = new OOo0l0ii10l();
/* 213 */           OOo0l0ii10l oOo0l0ii10l2 = new OOo0l0ii10l();
/* 218 */           Contents contentsOf = Contents.INSTANCE.of(arrayList);
/* 224 */           O111ol0lilll o111ol0lilll = new O111ol0lilll();
/* 227 */           o111ol0lilll.I00iiI = oOo0l0ii10l;
/* 229 */           o111ol0lilll.I00iiO = oOo0l0ii10l2;
/* 231 */           o111ol0lilll.I00iio = sb;
/* 233 */           o111ol0lilll.I00ilI0I1 = function3;
/* 235 */           o111ol0lilll.I00ilO0 = conversation;
/* 237 */           o111ol0lilll.I00iOIl = z;
/* 239 */           o111ol0lilll.I00io1l = o1oIOiI11o0;
/* 241 */           o111ol0lilll.I00ioIO = function1;
/* 243 */           VarHandle.storeStoreFence();
/* 246 */           if (map == null) {
/* 248 */               map = Il011I1OiO0I.I00iOIl;
                    }
/* 250 */           conversation.sendMessageAsync(contentsOf, o111ol0lilll, (Map<String, ? extends Object>) map);
                }

                public final void I000OiO(O1oIOiI11o0 o1oIOiI11o0, List list) {
/* 7 */             if (list.isEmpty()) {
/* 170 */               return;
                    }
/* 11 */            Object obj = o1oIOiI11o0.I00IlilI0i0i;
/* 21 */            O11illi o11illi = obj instanceof O11illi ? (O11illi) obj : null;
/* 22 */            if (o11illi == null) {
/* 170 */               return;
                    }
/* 46 */            String str = (String) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("Accelerator", Accelerator.GPU.getLabel()), ValueType.STRING);
/* 77 */            boolean z = str.equals(Accelerator.NPU.getLabel()) || str.equals(Accelerator.TPU.getLabel());
/* 111 */           int iIntValue = (int) (((Integer) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("Max tokens", Integer.valueOf(Barcode.FORMAT_UPC_E)), ValueType.INT)).intValue() * 0.7d);
/* 112 */           List listI001iOo1i0O = list;
/* 121 */           while (!listI001iOo1i0O.isEmpty()) {
/* 124 */               List list2 = listI001iOo1i0O;
/* 126 */               Iterator it = list2.iterator();
/* 130 */               int length = 0;
/* 135 */               while (it.hasNext()) {
/* 155 */                   length += (((String) ((OIoi0IIoi) it.next()).I00iiI).length() / 4) + 6;
                        }
/* 157 */               if (length <= iIntValue) {
                            break;
                        } else {
/* 159 */                   listI001iOo1i0O = IOOi0Ool1i.I001iOo1i0O(list2, 1);
                        }
                    }
/* 168 */           if (listI001iOo1i0O.isEmpty()) {
/* 170 */               return;
                    }
                    try {
/* 193 */               int iIntValue2 = ((Integer) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("TopK", 64), ValueType.INT)).intValue();
/* 220 */               float fFloatValue = ((Float) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("TopP", Float.valueOf(0.95f)), ValueType.FLOAT)).floatValue();
/* 246 */               float fFloatValue2 = ((Float) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("Temperature", Float.valueOf(1.0f)), ValueType.FLOAT)).floatValue();
/* 251 */               List<OIoi0IIoi> list3 = listI001iOo1i0O;
/* 261 */               ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list3, 10));
/* 272 */               for (OIoi0IIoi oIoi0IIoi : list3) {
/* 284 */                   boolean zBooleanValue = ((Boolean) oIoi0IIoi.I00iOIl).booleanValue();
/* 290 */                   String str2 = (String) oIoi0IIoi.I00iiI;
/* 307 */                   arrayList.add(zBooleanValue ? Message.INSTANCE.user(str2) : Message.INSTANCE.model(str2));
                        }
/* 349 */               Conversation conversationCreateConversation = o11illi.I00000oIO.createConversation(new ConversationConfig(o11illi.I0000Il00O, arrayList, o11illi.I0000O, z ? null : new SamplerConfig(iIntValue2, fFloatValue, fFloatValue2, (int) System.currentTimeMillis()), false, null, null, 112, null));
/* 355 */               o11illi.I00000oOI.close();
/* 364 */               o1oIOiI11o0.I00IlilI0i0i = O11illi.I00000oIO(o11illi, conversationCreateConversation, null, null, 13);
/* 366 */               listI001iOo1i0O.size();
/* 369 */               list.size();
                    } catch (Exception e) {
/* 378 */               Log.w("AGLlmChatModelHelper", "Re-prime from history failed; continuing without it", e);
                    }
                }
            }
