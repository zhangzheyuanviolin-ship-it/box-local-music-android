            package p000;

            import android.graphics.Bitmap;
            import android.os.Bundle;
            import com.google.ai.edge.gallery.common.SkillTryOutChip;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.google.mlkit.genai.speechrecognition.SpeechRecognizer;
            import com.google.mlkit.vision.facemesh.FaceMeshDetector;
            import com.google.mlkit.vision.pose.PoseDetector;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            
            public final class I0iI0llll1 implements IllOOo00lI {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;

                public I0iI0llll1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
                    Ol0ioI1iI ol0ioI1iI;
                    boolean z;
/* 1 */             int i = this.I00iOIl;
/* 4 */             boolean z2 = true;
/* 8 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 10 */            Object obj = null;
                    switch (i) {
                        case 0:
/* 354 */                   Ol0o1OiOIIIl ol0o1OiOIIIl = (Ol0o1OiOIIIl) this.I00ilI0I1;
/* 358 */                   SkillTryOutChip skillTryOutChip = (SkillTryOutChip) this.I00ilO0;
/* 362 */                   O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00io1l;
/* 366 */                   OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiI;
/* 370 */                   OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iiO;
/* 374 */                   OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00iio;
/* 376 */                   String skillName = skillTryOutChip.getSkillName();
/* 392 */                   Iterator it = ((Ol0loOOoo) ol0o1OiOIIIl.I0000O.getValue()).I00000oOI.iterator();
                            while (true) {
/* 400 */                       if (it.hasNext()) {
/* 402 */                           Object next = it.next();
/* 419 */                           if (O0000Ioio00.I0000O(((Ol0oI1llIloI) next).I00000oIO.I001i1O0Ol(), skillName)) {
/* 421 */                               obj = next;
                                    }
                                }
                            }
/* 422 */                   Ol0oI1llIloI ol0oI1llIloI = (Ol0oI1llIloI) obj;
/* 424 */                   if (ol0oI1llIloI == null || (ol0ioI1iI = ol0oI1llIloI.I00000oIO) == null || !ol0ioI1iI.I001l0I00()) {
/* 510 */                       oI10i0Il2.setValue(skillTryOutChip.getSkillName());
/* 515 */                       oI10i0Il3.setValue(Boolean.TRUE);
                            } else {
/* 454 */                       List listSingletonList = Collections.singletonList(new IO1iI1i(skillTryOutChip.getPrompt(), IO1loo.I00iOIl, 0.0f, null, false, 252));
/* 458 */                       Oil1Oil1i01l oil1Oil1i01l = new Oil1Oil1i01l();
/* 461 */                       oil1Oil1i01l.I00000oIO = o1oIOiI11o0;
/* 463 */                       oil1Oil1i01l.I00000oOI = listSingletonList;
/* 465 */                       VarHandle.storeStoreFence();
/* 468 */                       oI10i0Il.setValue(oil1Oil1i01l);
/* 471 */                       FirebaseAnalytics firebaseAnalyticsI00000oIO = iOIii1ooOi0I.I00000oIO();
/* 475 */                       if (firebaseAnalyticsI00000oIO != null) {
/* 477 */                           Ilo0li0l1[] ilo0li0l1Arr = Ilo0li0l1.I00iOIl;
/* 481 */                           Bundle bundle = new Bundle();
/* 488 */                           bundle.putString("event_type", "agent_skills_prompt_chip");
/* 497 */                           bundle.putString("button_id", skillTryOutChip.getLabel());
/* 502 */                           firebaseAnalyticsI00000oIO.I00000oIO("button_clicked", bundle);
                                }
                            }
/* 518 */                   return ooiIlOl1iI;
                        case 1:
/* 293 */                   Ii0110 ii0110 = (Ii0110) this.I00ilI0I1;
/* 297 */                   OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00iiI;
/* 302 */                   OI10i0Il oI10i0Il5 = (OI10i0Il) this.I00iiO;
/* 307 */                   OI10i0Il oI10i0Il6 = (OI10i0Il) this.I00iio;
/* 312 */                   FaceMeshDetector faceMeshDetector = (FaceMeshDetector) this.I00ilO0;
/* 317 */                   OI10i0Il oI10i0Il7 = (OI10i0Il) this.I00io1l;
/* 324 */                   Bitmap bitmap = (Bitmap) oI10i0Il4.getValue();
/* 326 */                   if (bitmap != null) {
/* 331 */                       oI10i0Il5.setValue(Boolean.TRUE);
/* 334 */                       oI10i0Il6.setValue("");
/* 337 */                       IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 348 */                       iOi1II01i0.I0000O(ii0110, Ii1oo1ooill0.I00iiI, null, new I000oI1ioi(faceMeshDetector, bitmap, oI10i0Il6, oI10i0Il7, oI10i0Il5, null, 7), 2);
                            }
/* 351 */                   return ooiIlOl1iI;
                        case 2:
/* 228 */                   OI10i0Il oI10i0Il8 = (OI10i0Il) this.I00iiI;
/* 232 */                   Ii0110 ii01102 = (Ii0110) this.I00ilI0I1;
/* 237 */                   SpeechRecognizer speechRecognizer = (SpeechRecognizer) this.I00ilO0;
/* 242 */                   OI10i0Il oI10i0Il9 = (OI10i0Il) this.I00iiO;
/* 247 */                   OI10i0Il oI10i0Il10 = (OI10i0Il) this.I00iio;
/* 252 */                   OI10i0Il oI10i0Il11 = (OI10i0Il) this.I00io1l;
/* 264 */                   if (((Boolean) oI10i0Il8.getValue()).booleanValue()) {
/* 266 */                       Iloo0ilo.I001lIiIIo1O(ii01102, speechRecognizer, oI10i0Il8);
                            } else {
/* 272 */                       oI10i0Il8.setValue(Boolean.TRUE);
/* 275 */                       oI10i0Il9.setValue("");
/* 278 */                       oI10i0Il10.setValue("");
/* 287 */                       iOi1II01i0.I0000O(ii01102, null, null, new IloliIli(speechRecognizer, oI10i0Il9, oI10i0Il11, oI10i0Il8, oI10i0Il10, null), 3);
                            }
/* 290 */                   return ooiIlOl1iI;
                        case 3:
/* 165 */                   Ii0110 ii01103 = (Ii0110) this.I00ilI0I1;
/* 169 */                   OI10i0Il oI10i0Il12 = (OI10i0Il) this.I00iiI;
/* 174 */                   OI10i0Il oI10i0Il13 = (OI10i0Il) this.I00iiO;
/* 179 */                   OI10i0Il oI10i0Il14 = (OI10i0Il) this.I00iio;
/* 184 */                   PoseDetector poseDetector = (PoseDetector) this.I00ilO0;
/* 189 */                   OI10i0Il oI10i0Il15 = (OI10i0Il) this.I00io1l;
/* 196 */                   Bitmap bitmap2 = (Bitmap) oI10i0Il12.getValue();
/* 198 */                   if (bitmap2 != null) {
/* 203 */                       oI10i0Il13.setValue(Boolean.TRUE);
/* 206 */                       oI10i0Il14.setValue("");
/* 209 */                       IiI0oillOO10 iiI0oillOO102 = IiiIil1lOIO.I00000oIO;
/* 221 */                       iOi1II01i0.I0000O(ii01103, Ii1oo1ooill0.I00iiI, null, new I000oI1ioi(poseDetector, bitmap2, oI10i0Il14, oI10i0Il15, oI10i0Il13, null, 8), 2);
                            }
/* 224 */                   return ooiIlOl1iI;
                        case 4:
/* 121 */                   IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00ilI0I1;
/* 125 */                   OloIl1l1oOii oloIl1l1oOii = (OloIl1l1oOii) this.I00ilO0;
/* 129 */                   Ii0110 ii01104 = (Ii0110) this.I00io1l;
/* 133 */                   OI10i0Il oI10i0Il16 = (OI10i0Il) this.I00iiI;
/* 137 */                   Ol010000lo00 ol010000lo00 = (Ol010000lo00) this.I00iio;
/* 141 */                   OI10i0Il oI10i0Il17 = (OI10i0Il) this.I00iiO;
/* 147 */                   O1oIOiI11o0 o1oIOiI11o02 = (O1oIOiI11o0) oI10i0Il16.getValue();
/* 149 */                   if (o1oIOiI11o02 != null) {
/* 151 */                       illiIl1l11O.invoke(oloIl1l1oOii, o1oIOiI11o02);
                            }
/* 159 */                   iOi1II01i0.I0000O(ii01104, null, null, new II000lIl0o10(ol010000lo00, oI10i0Il17, null, 2), 3);
/* 162 */                   return ooiIlOl1iI;
                        case 5:
/* 55 */                    OiIiOi0II oiIiOi0II = (OiIiOi0II) this.I00ilI0I1;
/* 59 */                    OiIoliiIoIi0 oiIoliiIoIi0 = (OiIoliiIoIi0) this.I00ilO0;
/* 63 */                    OiIiol10 oiIiol10 = (OiIiol10) this.I00io1l;
/* 67 */                    String str = (String) this.I00iiI;
/* 69 */                    Object obj2 = this.I00iiO;
/* 73 */                    Object[] objArr = (Object[]) this.I00iio;
/* 77 */                    if (oiIiOi0II.I00iiI != oiIiol10) {
/* 79 */                        oiIiOi0II.I00iiI = oiIiol10;
/* 81 */                        z = true;
                            } else {
/* 83 */                        z = false;
                            }
/* 90 */                    if (O0000Ioio00.I0000O(oiIiOi0II.I00iiO, str)) {
/* 95 */                        z2 = z;
                            } else {
/* 92 */                        oiIiOi0II.I00iiO = str;
                            }
/* 96 */                    oiIiOi0II.I00iOIl = oiIoliiIoIi0;
/* 98 */                    oiIiOi0II.I00iio = obj2;
/* 100 */                   oiIiOi0II.I00ilI0I1 = objArr;
/* 102 */                   OiIiloli0I oiIiloli0I = oiIiOi0II.I00ilO0;
/* 104 */                   if (oiIiloli0I != null && z2) {
/* 110 */                       ((IOO000ilo) oiIiloli0I).I00Io1o110i();
/* 113 */                       oiIiOi0II.I00ilO0 = null;
/* 115 */                       oiIiOi0II.I00000oIO();
                            }
/* 118 */                   return ooiIlOl1iI;
                        default:
/* 48 */                    return Boolean.valueOf(((OlilioIoO11) this.I00ilI0I1).I00000oIO((OliliiIIiil) this.I00ilO0, (ArrayList) this.I00io1l, (LinkedHashMap) this.I00iiI, (List) this.I00iiO, (ArrayList) this.I00iio));
                    }
                }
            }
