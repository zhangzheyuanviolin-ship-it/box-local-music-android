            package p000;

            import android.content.Context;
            import android.widget.Toast;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.ai.edge.gallery.ui.common.SavedSystemPrompt;
            import java.io.ByteArrayInputStream;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
/* 12 */    public final class II01oIlIII implements IllOOo00lI {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public II01oIlIII(O0II0llIl o0II0llIl, ByteArrayInputStream byteArrayInputStream, IiOo0lO1 iiOo0lO1) {
/* 2 */             this.I00iOIl = 5;
/* 7 */             this.I00iiO = o0II0llIl;
/* 9 */             this.I00iiI = byteArrayInputStream;
/* 11 */            this.I00iio = iiOo0lO1;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IOoil1iiIilo iOoil1iiIilo = null;
/* 4 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 414 */                   ((OI10i0Il) this.I00iiI).setValue(((II00Ol1Ii) this.I00iiO).I00000oIO);
/* 423 */                   ((OI10i0Il) this.I00iio).setValue(Boolean.TRUE);
                            break;
                        case 1:
/* 367 */                   OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiI;
/* 371 */                   Conversation conversation = (Conversation) this.I00iiO;
/* 373 */                   oI10i0Il.setValue(conversation);
/* 378 */                   IO1OIo01l1 iO1OIo01l1 = (IO1OIo01l1) this.I00iio;
/* 380 */                   String id = conversation.getId();
/* 384 */                   IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(iO1OIo01l1);
/* 388 */                   IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 400 */                   iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new I00oIiI10(iO1OIo01l1, id, null, 23), 2);
                            break;
                        case 2:
/* 361 */                   ((IlliIl1l11O) this.I00iiO).invoke((O1oIOiI11o0) this.I00iiI, (IO1OO01i0) this.I00iio);
                            break;
                        case 3:
/* 334 */                   ((OI10i0Il) this.I00iio).setValue(Boolean.TRUE);
/* 345 */                   ((OI10i0Il) this.I00iiI).setValue((IO1OO01i0) this.I00iiO);
                            break;
                        case 4:
/* 259 */                   OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iiI;
/* 261 */                   List list = IOll1OIIi0O1.I00000oIO;
/* 267 */                   List list2 = (List) oI10i0Il2.getValue();
/* 273 */                   SavedSystemPrompt savedSystemPrompt = (SavedSystemPrompt) this.I00iio;
/* 277 */                   ArrayList arrayList = new ArrayList();
/* 288 */                   for (Object obj : list2) {
/* 309 */                       if (!O0000Ioio00.I0000O(((SavedSystemPrompt) obj).getId(), savedSystemPrompt.getId())) {
/* 311 */                           arrayList.add(obj);
                                }
                            }
/* 315 */                   oI10i0Il2.setValue(arrayList);
/* 318 */                   OoIlIoo1oiOo ooIlIoo1oiOo = OiIlo1o1i.I00000oIO;
/* 324 */                   OiIlo1o1i.I00000oIO((Context) this.I00iiO, arrayList);
                            break;
                        case 5:
                            break;
                        case 6:
/* 207 */                   OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00iiI;
/* 211 */                   Conversation conversation2 = (Conversation) this.I00iiO;
/* 213 */                   List list3 = Iloo0ilo.I00000oIO;
/* 215 */                   oI10i0Il3.setValue(conversation2);
/* 226 */                   ((OI10i0Il) this.I00iio).setValue(conversation2.getTitle());
                            break;
                        case 7:
/* 153 */                   O0Ii1IOoiO o0Ii1IOoiO = (O0Ii1IOoiO) this.I00iiO;
/* 157 */                   Class cls = (Class) this.I00iiI;
/* 161 */                   IOIOill iOIOill = (IOIOill) this.I00iio;
/* 163 */                   Class cls2 = o0Ii1IOoiO.I00iiI;
/* 173 */                   if (O0000Ioio00.I0000O(cls2.getSuperclass(), cls)) {
                                break;
                            } else {
/* 184 */                       int iI001l0I00 = I1IoiO1l.I001l0I00(cls2.getInterfaces(), cls);
/* 188 */                       if (iI001l0I00 >= 0) {
                                    break;
                                } else {
/* 201 */                           IoOOl0iOl1io.I00100l0("No superclass of ", o0Ii1IOoiO, " in Java reflection for ", iOIOill);
                                    break;
                                }
                            }
                        case 8:
/* 138 */                   ((OI10i0Il) this.I00iiI).setValue(((O1i1Ooo0ll) this.I00iiO).I00000oIO.I001i1O0Ol());
/* 147 */                   ((OI10i0Il) this.I00iio).setValue(Boolean.TRUE);
                            break;
                        case 9:
/* 103 */                   OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00iiI;
/* 107 */                   OOio1iliiii oOio1iliiii = (OOio1iliiii) this.I00iiO;
/* 111 */                   oI10i0Il4.setValue(oOio1iliiii.I00000oIO);
/* 120 */                   ((OI10i0Il) this.I00iio).setValue(oOio1iliiii.I00000oOI);
                            break;
                        case 10:
/* 70 */                    OI10i0Il oI10i0Il5 = (OI10i0Il) this.I00iiI;
/* 76 */                    if (!Ol0lllilO0Ol.I0000oI00(oI10i0Il5)) {
/* 80 */                        oI10i0Il5.setValue(Boolean.TRUE);
/* 97 */                        ((Ol1o0O0O0) this.I00iiO).add(((Ol0oI1llIloI) this.I00iio).I00000oIO.I001i1O0Ol());
                                break;
                            }
                            break;
                        case 11:
/* 64 */                    iOi1II01i0.I0000O((Ii0110) this.I00iiO, null, null, new Ol110ii1I((Function1) this.I00iiI, (String) this.I00iio, iOoil1iiIilo, 8), 3);
                            break;
                        default:
/* 26 */                    ((I0lOl0I0) ((IOO0i0o1O0l) this.I00iiO)).I00000oOI(new I1111OO10i(((OoIIliIIII0) this.I00iiI).I0001Ioi1lo));
/* 40 */                    Toast.makeText((Context) this.I00iio, "Copied", 0).show();
                            break;
                    }
/* 43 */            return ooiIlOl1iI;
                }

/* 13 */        public II01oIlIII(int i) {
/* 14 */            this.I00iOIl = i;
                }
            }
