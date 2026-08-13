            package p000;

            import com.google.ai.edge.gallery.data.local.entities.FaceRecord;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.File;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import kotlin.jvm.functions.Function1;
            
            public final class Iil0iiOiI implements Function1 {
                public final int I00iOIl;

                public Iil0iiOiI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) throws Exception {
                    OiIIl0O1l0l oiIIl0O1l0lI00000oIO;
/* 1 */             int i = this.I00iOIl;
/* 13 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 14 */            II111ioOoi iI111ioOoi = OII0I1ii.I000O01llI0;
/* 16 */            int i2 = 2;
/* 19 */            int i3 = 1;
/* 20 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 579 */                   return new OI1I0OoOl();
                        case 1:
/* 574 */                   return ooiIlOl1iI;
                        case 2:
/* 569 */                   return Boolean.TRUE;
                        case 3:
/* 553 */                   float fFloatValue = ((Float) obj).floatValue();
/* 557 */                   OoIoO0I0oOI ooIoO0I0oOI = OII0IoiI.I00000oIO;
/* 562 */                   return Float.valueOf(fFloatValue * 0.5f);
                        case 4:
/* 550 */                   return ooiIlOl1iI;
                        case 5:
/* 531 */                   oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("DELETE FROM faces");
                            try {
/* 535 */                       oiIIl0O1l0lI00000oIO.I00ol1();
/* 541 */                       return ooiIlOl1iI;
                            } finally {
/* 544 */                       oiIIl0O1l0lI00000oIO.close();
                            }
                        case 6:
/* 442 */                   oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT * FROM faces ORDER BY created_at DESC");
                            try {
/* 448 */                       int iI00000oIO = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "id");
/* 454 */                       int iI00000oIO2 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "name");
/* 460 */                       int iI00000oIO3 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "embedding");
/* 466 */                       int iI00000oIO4 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "thumbnail");
/* 472 */                       int iI00000oIO5 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "created_at");
/* 478 */                       ArrayList arrayList = new ArrayList();
/* 485 */                       while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 512 */                           arrayList.add(new FaceRecord(oiIIl0O1l0lI00000oIO.getLong(iI00000oIO), oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO2), oiIIl0O1l0lI00000oIO.getBlob(iI00000oIO3), oiIIl0O1l0lI00000oIO.getBlob(iI00000oIO4), oiIIl0O1l0lI00000oIO.getLong(iI00000oIO5)));
                                }
/* 522 */                       return arrayList;
                            } finally {
                            }
                        case 7:
/* 435 */                   return ((Il0Oo11iiO) obj).I00000oIO;
                        case 8:
/* 395 */                   ((File) obj).getCanonicalFile().getAbsolutePath();
/* 400 */                   Ol0Oiooo ol0Oiooo = new Ol0Oiooo();
/* 408 */                   ol0Oiooo.I00000oIO = new OI1I0OoOl();
/* 415 */                   ol0Oiooo.I00000oOI = new Oi1ol0llI(3);
/* 427 */                   ol0Oiooo.I0000Il00O = ilOl0O00Il0i.I00000oOI(new I01ii1i(i2, iOoil1iiIilo, 5));
/* 429 */                   VarHandle.storeStoreFence();
/* 432 */                   return ol0Oiooo;
                        case 9:
/* 385 */                   l11I11lO.I0000O(3, "CXCP");
/* 388 */                   return ooiIlOl1iI;
                        case 10:
/* 379 */                   l11I11lO.I0000O(3, "CXCP");
/* 382 */                   return ooiIlOl1iI;
                        case 11:
/* 373 */                   Oil0Io.I000OiO((Oil0O0I) obj, 0);
/* 376 */                   return ooiIlOl1iI;
                        case 12:
/* 370 */                   return ooiIlOl1iI;
                        case 13:
/* 367 */                   return ooiIlOl1iI;
                        case 14:
/* 364 */                   return ooiIlOl1iI;
                        case 15:
/* 361 */                   return ooiIlOl1iI;
                        case 16:
/* 318 */                   Function1[] function1Arr = {new Iil0iiOiI(18), new Iil0iiOiI(19), new Iil0iiOiI(20), new Iil0iiOiI(21)};
/* 330 */                   I1oil1O1Oiio i1oil1O1Oiio = new I1oil1O1Oiio(i3);
/* 333 */                   i1oil1O1Oiio.I00iiI = (Oi1O00I1) obj;
/* 335 */                   i1oil1O1Oiio.I00iiO = function1Arr;
/* 337 */                   VarHandle.storeStoreFence();
/* 345 */                   IOii1l iOii1l = new IOii1l(-373393724, i1oil1O1Oiio, true);
/* 350 */                   OIil1IOI oIil1IOI = new OIil1IOI();
/* 353 */                   oIil1IOI.I00000oIO = iOii1l;
/* 355 */                   VarHandle.storeStoreFence();
/* 358 */                   return oIil1IOI;
                        case 17:
/* 258 */                   I1oii000Ooi i1oii000Ooi = new I1oii000Ooi(i2);
/* 261 */                   i1oii000Ooi.I00iiI = (Oi1O00I1) obj;
/* 263 */                   i1oii000Ooi.I00iiO = new String[]{"•", "◦", "▸", "▹"};
/* 265 */                   VarHandle.storeStoreFence();
/* 273 */                   IOii1l iOii1l2 = new IOii1l(15273025, i1oii000Ooi, true);
/* 278 */                   OoiOo0oIOIl1 ooiOo0oIOIl1 = new OoiOo0oIOIl1();
/* 281 */                   ooiOo0oIOIl1.I00000oIO = iOii1l2;
/* 283 */                   VarHandle.storeStoreFence();
/* 286 */                   return ooiOo0oIOIl1;
                        case PoseLandmark.RIGHT_PINKY:
/* 237 */                   return (((Integer) obj).intValue() + 1) + ".";
                        case PoseLandmark.LEFT_INDEX:
/* 214 */                   return ((Character) IOOi0Ool1i.I001lllioOl(IOOi0Ool1i.I001iOo1i0O(new IO11lol('a', 'z'), ((Integer) obj).intValue() % 26))).charValue() + ".";
                        case PoseLandmark.RIGHT_INDEX:
/* 171 */                   return (((Integer) obj).intValue() + 1) + ")";
                        case PoseLandmark.LEFT_THUMB:
/* 148 */                   return ((Character) IOOi0Ool1i.I001lllioOl(IOOi0Ool1i.I001iOo1i0O(new IO11lol('a', 'z'), ((Integer) obj).intValue() % 26))).charValue() + ")";
                        case PoseLandmark.RIGHT_THUMB:
/* 105 */                   return ((O1iIo0ll) obj).I001lllioOl(IOo0olo.I00000oOI(0, 0, 0, 0, 15));
                        case PoseLandmark.LEFT_HIP:
/* 94 */                    return Il1OOloOIl1.I00000oOI;
                        case PoseLandmark.RIGHT_HIP:
/* 79 */                    IOloIIl1 iOloIIl1 = ((OI1OiOloi) obj).I00000oIO;
/* 83 */                    iOloIIl1.I0000Il00O = OII0I1ii.I000OiO;
/* 85 */                    iOloIIl1.I00000oIO = true;
/* 87 */                    iOloIIl1.I0000O = null;
/* 89 */                    iOloIIl1.I00000oOI = true;
/* 91 */                    return ooiIlOl1iI;
                        case PoseLandmark.LEFT_KNEE:
/* 66 */                    IOloIIl1 iOloIIl12 = ((OI1OiOloi) obj).I00000oIO;
/* 68 */                    iOloIIl12.I0000Il00O = iI111ioOoi;
/* 72 */                    iOloIIl12.I0000O = Boolean.TRUE;
/* 74 */                    iOloIIl12.I00000oOI = true;
/* 76 */                    return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_KNEE:
/* 53 */                    IOloIIl1 iOloIIl13 = ((OI1OiOloi) obj).I00000oIO;
/* 55 */                    iOloIIl13.I0000Il00O = iI111ioOoi;
/* 59 */                    iOloIIl13.I0000O = Boolean.FALSE;
/* 61 */                    iOloIIl13.I00000oOI = true;
/* 63 */                    return ooiIlOl1iI;
                        case 27:
/* 46 */                    return Ilo1IoOo.I0000Il00O((I10l1l11) obj);
                        case PoseLandmark.RIGHT_ANKLE:
/* 39 */                    return Ilo1IoOo.I0000O((I10l1l11) obj);
                        default:
/* 32 */                    return Integer.valueOf(-((Integer) obj).intValue());
                    }
                }
            }
