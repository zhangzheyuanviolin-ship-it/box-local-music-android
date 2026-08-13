            package p000;

            import android.content.Intent;
            import android.os.Build;
            import android.speech.SpeechRecognizer;
            import android.view.View;
            import android.view.inputmethod.BaseInputConnection;
            import android.view.inputmethod.InputMethodManager;
            import com.google.ai.edge.gallery.data.DeviceRequirements;
            import com.google.ai.edge.gallery.data.ModelAllowlist;
            import com.google.ai.edge.gallery.data.NamedDeviceGroup;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.File;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Locale;
            import java.util.Set;
            import kotlin.jvm.functions.Function3;
            
            public final class IlIi0Il implements IllOOo00lI {
                public final int I00iOIl;
                public Object I00iiI;

                public IlIi0Il(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
                    IOlIOiI0iiI1 iOlIOiI0iiI1;
                    String str;
                    List<NamedDeviceGroup> allowedDeviceGroups;
                    Set setSingleton;
/* 3 */             Set set = null;
/* 4 */             boolean z = true;
/* 4 */             z = true;
/* 5 */             boolean zContains = false;
/* 5 */             zContains = false;
/* 5 */             zContains = false;
                    switch (this.I00iOIl) {
                        case 0:
/* 827 */                   File file = (File) this.I00iiI;
                            synchronized (IlIi11li.I0000oI00) {
/* 838 */                       IlIi11li.I0000O.remove(file.getAbsolutePath());
                            }
/* 842 */                   return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 819 */                   ((IliIO10oO0) this.I00iiI).I010lI0oi();
/* 822 */                   return OoiIlOl1iI.I00000oIO;
                        case 2:
/* 748 */                   IllOI1IoO illOI1IoO = (IllOI1IoO) this.I00iiI;
/* 750 */                   String str2 = illOI1IoO.I00iiI;
/* 805 */                   IllOI010l illOI010l = (str2 == null || !illOI1IoO.I00iio) ? new IllOI010l(illOI1IoO.I00iOIl, illOI1IoO.I00iiI, new Oi00IilOloo0(), illOI1IoO.I00iiO, illOI1IoO.I00ilI0I1) : new IllOI010l(illOI1IoO.I00iOIl, new File(illOI1IoO.I00iOIl.getNoBackupFilesDir(), str2).getAbsolutePath(), new Oi00IilOloo0(), illOI1IoO.I00iiO, illOI1IoO.I00ilI0I1);
/* 811 */                   illOI010l.setWriteAheadLoggingEnabled(illOI1IoO.I00io1l);
/* 814 */                   return illOI010l;
                        case 3:
/* 741 */                   return Float.valueOf(lOiIo0.I000O01llI0(((Ii0110) this.I00iiI).I00000oIO()));
                        case 4:
/* 726 */                   return (InputMethodManager) ((View) ((IoIlOo1o0IIl) this.I00iiI).I00iiI).getContext().getSystemService("input_method");
                        case 5:
/* 705 */                   return (InputMethodManager) ((View) ((IoloOio0I) this.I00iiI).I00iiI).getContext().getSystemService("input_method");
                        case 6:
/* 666 */                   Oi1oIiOiIi0 oi1oIiOiIi0 = ((O00IOI11) this.I00iiI).I00000oIO;
/* 672 */                   if (oi1oIiOiIi0.I000iOII() && !oi1oIiOiIi0.I000oI1ioi()) {
/* 681 */                       z = false;
                            }
/* 682 */                   return Boolean.valueOf(z);
                        case 7:
/* 645 */                   Object obj = ((OoOOlOlI) this.I00iiI).I00iOIl;
/* 654 */                   O0iI0I o0iI0I = obj instanceof O0iI0I ? (O0iI0I) obj : null;
/* 655 */                   if (o0iI0I != null) {
/* 657 */                       return o0iI0I.I00000oIO();
                            }
/* 3 */                     return null;
                        case 8:
/* 626 */                   O0iioO o0iioO = ((O0iiOioolIi) this.I00iiI).I010I0;
/* 630 */                   o0iioO.I00100l0.I00oo1iO0ll = true;
/* 632 */                   O1IioI o1IioI = o0iioO.I00100o1O0lo;
/* 634 */                   if (o1IioI != null) {
/* 636 */                       o1IioI.I00oO101o = true;
                            }
/* 638 */                   return OoiIlOl1iI.I00000oIO;
                        case 9:
/* 596 */                   O0il1o0oIi o0il1o0oIi = (O0il1o0oIi) this.I00iiI;
/* 610 */                   if (!((Boolean) o0il1o0oIi.I000II.getValue()).booleanValue() && (iOlIOiI0iiI1 = o0il1o0oIi.I0000Il00O) != null) {
/* 616 */                       iOlIOiI0iiI1.I000oI1ioi();
                            }
/* 619 */                   return OoiIlOl1iI.I00000oIO;
                        case 10:
/* 589 */                   return Integer.valueOf(((O0l0i1O) ((O0l101IIlOI0) this.I00iiI).I0000oI00.getValue()).I000lI);
                        case 11:
/* 565 */                   IiiO11O iiiO11O = ((O0li0o) this.I00iiI).I000OiO;
/* 567 */                   if (iiiO11O != null) {
/* 569 */                       il1ollIO0I.I00000oIO(iiiO11O);
                            }
/* 572 */                   return OoiIlOl1iI.I00000oIO;
                        case 12:
/* 557 */                   return new BaseInputConnection(((O0oIo1) this.I00iiI).I00000oIO, false);
                        case 13:
/* 525 */                   O1OIiIOOoOO o1OIiIOOoOO = (O1OIiIOOoOO) ((O0oil001) this.I00iiI).I00000oIO.I00iiI;
/* 529 */                   if (!o1OIiIOOoOO.I00iiI) {
/* 534 */                       if (o1OIiIOOoOO.I00iiO) {
/* 538 */                           OO1oioOIl11.I00000oIO("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                                }
/* 541 */                       o1OIiIOOoOO.I00000oIO();
/* 544 */                       o1OIiIOOoOO.I00iiO = true;
                            }
/* 546 */                   return OoiIlOl1iI.I00000oIO;
                        case 14:
/* 511 */                   ((Function3) this.I00iiI).invoke("", Boolean.TRUE, null);
/* 514 */                   return OoiIlOl1iI.I00000oIO;
                        case 15:
/* 474 */                   SpeechRecognizer speechRecognizer = (SpeechRecognizer) this.I00iiI;
/* 480 */                   Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
/* 487 */                   intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
/* 492 */                   intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
/* 495 */                   if (speechRecognizer != null) {
/* 497 */                       speechRecognizer.startListening(intent);
                            }
/* 500 */                   return OoiIlOl1iI.I00000oIO;
                        case 16:
/* 461 */                   O11iO00I1o o11iO00I1o = (O11iO00I1o) this.I00iiI;
/* 463 */                   o11iO00I1o.I000iOII(false);
/* 466 */                   o11iO00I1o.I000lI(false);
/* 469 */                   return OoiIlOl1iI.I00000oIO;
                        case 17:
/* 448 */                   O11l1I o11l1I = (O11l1I) this.I00iiI;
/* 450 */                   o11l1I.I0001Ioi1lo(false);
/* 453 */                   o11l1I.I0000oI00(false);
/* 456 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_PINKY:
/* 431 */                   OIooi1iOiOol oIooi1iOiOol = (OIooi1iOiOol) this.I00iiI;
/* 440 */                   oIooi1iOiOol.I000O01llI0(oIooi1iOiOol.I000II() == 1 ? 0 : 1);
/* 443 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_INDEX:
/* 423 */                   ((O1o0l0ilo) this.I00iiI).I00000oIO.clear();
/* 426 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_INDEX:
/* 412 */                   return Float.valueOf(lIiioliIlo.I00000oOI(((OOI00IlO0) this.I00iiI).I00000oOI, 0.0f, 1.0f));
                        case PoseLandmark.LEFT_THUMB:
/* 394 */                   return Boolean.valueOf(((Ol010l0o0O) ((IiO0o1I) ((Ol010000lo00) this.I00iiI).I0000oI00.I000iOII).getValue()) != Ol010l0o0O.I00iOIl);
                        case PoseLandmark.RIGHT_THUMB:
/* 241 */                   DeviceRequirements aicoreRequirements = ((ModelAllowlist) ((OOo0ooi) this.I00iiI).I00iOIl).getAicoreRequirements();
/* 245 */                   if (aicoreRequirements != null && (allowedDeviceGroups = aicoreRequirements.getAllowedDeviceGroups()) != null) {
/* 289 */                       OoI0o1II0o ooI0o1II0o = (OoI0o1II0o) new OoI10o0iO11O(new IlOIIioI1(IOOi0Ool1i.I001IO000(allowedDeviceGroups), new O1o0i0Ol0Oo0(11), OilOOii.I00ioIO), new O1o0i0Ol0Oo0(12)).iterator();
/* 291 */                       Iterator it = ooI0o1II0o.I00iOIl;
/* 297 */                       if (it.hasNext()) {
/* 303 */                           Object next = ooI0o1II0o.next();
/* 311 */                           if (it.hasNext()) {
/* 320 */                               LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 323 */                               linkedHashSet.add(next);
/* 330 */                               while (it.hasNext()) {
/* 336 */                                   linkedHashSet.add(ooI0o1II0o.next());
                                        }
/* 340 */                               set = linkedHashSet;
                                    } else {
/* 313 */                               setSingleton = Collections.singleton(next);
                                    }
                                } else {
/* 299 */                           setSingleton = Il01llIol0.I00iOIl;
                                }
/* 301 */                       set = setSingleton;
                            }
/* 342 */                   Set set2 = set;
/* 344 */                   if (set2 != null && !set2.isEmpty() && (str = Build.MODEL) != null) {
/* 363 */                       zContains = set.contains(str.toLowerCase(Locale.ROOT));
                            }
/* 367 */                   return Boolean.valueOf(zContains);
                        case PoseLandmark.LEFT_HIP:
/* 92 */                    O1ooilI0 o1ooilI0 = (O1ooilI0) this.I00iiI;
/* 94 */                    o1ooilI0.I0001Ioi1lo = false;
/* 98 */                    HashSet hashSet = new HashSet();
/* 101 */                   OI0oiiIO0 oI0oiiIO0 = o1ooilI0.I0000O;
/* 103 */                   if (oI0oiiIO0 != null) {
/* 105 */                       Object[] objArr = oI0oiiIO0.I00000oIO;
/* 107 */                       int i = oI0oiiIO0.I00000oOI;
/* 110 */                       for (int i2 = 0; i2 < i; i2++) {
/* 114 */                           O0iiOioolIi o0iiOioolIi = (O0iiOioolIi) objArr[i2];
/* 116 */                           OI0oiiIO0 oI0oiiIO02 = o1ooilI0.I0000oI00;
/* 118 */                           if (oI0oiiIO02 == null) {
/* 122 */                               oI0oiiIO02 = new OI0oiiIO0();
/* 125 */                               o1ooilI0.I0000oI00 = oI0oiiIO02;
                                    }
/* 131 */                           OOiIii oOiIii = (OOiIii) oI0oiiIO02.I000II(i2);
/* 137 */                           O1ooOo o1ooOo = (O1ooOo) o0iiOioolIi.I010101Oo1lO.I00io1l;
/* 141 */                           if (o1ooOo.I00lll10) {
/* 143 */                               O1ooilI0.I00000oOI(o1ooOo, oOiIii);
                                    }
                                }
/* 149 */                       oI0oiiIO0.I0000oI00();
/* 152 */                       OI0oiiIO0 oI0oiiIO03 = o1ooilI0.I0000oI00;
/* 154 */                       if (oI0oiiIO03 != null) {
/* 156 */                           oI0oiiIO03.I0000oI00();
                                }
                            }
/* 159 */                   OI0oiiIO0 oI0oiiIO04 = o1ooilI0.I00000oOI;
/* 161 */                   if (oI0oiiIO04 != null) {
/* 163 */                       Object[] objArr2 = oI0oiiIO04.I00000oIO;
/* 165 */                       int i3 = oI0oiiIO04.I00000oOI;
/* 167 */                       for (int i4 = 0; i4 < i3; i4++) {
/* 171 */                           I1o1il i1o1il = (I1o1il) objArr2[i4];
/* 173 */                           OI0oiiIO0 oI0oiiIO05 = o1ooilI0.I0000Il00O;
/* 175 */                           if (oI0oiiIO05 == null) {
/* 179 */                               oI0oiiIO05 = new OI0oiiIO0();
/* 182 */                               o1ooilI0.I0000Il00O = oI0oiiIO05;
                                    }
/* 188 */                           OOiIii oOiIii2 = (OOiIii) oI0oiiIO05.I000II(i4);
/* 192 */                           if (i1o1il.I00lll10) {
/* 194 */                               O1ooilI0.I00000oOI(i1o1il, oOiIii2);
                                    }
                                }
/* 200 */                       oI0oiiIO04.I0000oI00();
/* 203 */                       OI0oiiIO0 oI0oiiIO06 = o1ooilI0.I0000Il00O;
/* 205 */                       if (oI0oiiIO06 != null) {
/* 207 */                           oI0oiiIO06.I0000oI00();
                                }
                            }
/* 210 */                   Iterator it2 = hashSet.iterator();
/* 218 */                   while (it2.hasNext()) {
/* 226 */                       ((I1o1il) it2.next()).I010lI0oi();
                            }
/* 230 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_HIP:
/* 76 */                    String str3 = (String) this.I00iiI;
/* 80 */                    Io1lOlI io1lOlI = new Io1lOlI();
/* 83 */                    io1lOlI.I00000oOI = str3;
/* 85 */                    return io1lOlI.I00000oIO();
                        case PoseLandmark.LEFT_KNEE:
/* 71 */                    return ((OIIII0oOo1o) this.I00iiI).I0000O;
                        case PoseLandmark.RIGHT_KNEE:
/* 62 */                    return ((OIIIi0lOoOl) this.I00iiI).I010l1O();
                        case 27:
/* 52 */                    ((O1l110o) this.I00iiI).invoke();
/* 55 */                    return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_ANKLE:
/* 44 */                    return new File(((OIOI0I) this.I00iiI).I00000oIO.getFilesDir(), "scheduled_notifications.pb");
                        default:
/* 19 */                    OI1lOo oI1lOo = new OI1lOo(10);
/* 22 */                    VarHandle.storeStoreFence();
/* 25 */                    return lO1o10lllO0I.I00000oOI("kotlin.Unit", Oli00oo0l.I0000oI00, new OilOloI[0], oI1lOo);
                    }
                }
            }
