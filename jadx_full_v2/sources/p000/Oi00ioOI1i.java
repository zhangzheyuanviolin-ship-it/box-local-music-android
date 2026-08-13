            package p000;

            import android.content.Context;
            import android.os.Binder;
            import android.os.IBinder;
            import android.os.Parcel;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.UUID;
            
/* 18 */    public final class Oi00ioOI1i extends Binder implements IoOlo00 {
                public static final int I000O01llI0 = 0;
                public static final byte[] I000OOo1O = new byte[0];
                public i01IlOO I000II;

                @Override
                public final void I001lloI(IoOlo1llOO ioOlo1llOO, byte[] bArr) {
/* 1 */             i01IlOO i01iloo = this.I000II;
                    try {
/* 9 */                 OIoloo oIoloo = (OIoloo) l1oOOloO0.I00000oOI(bArr, OIoloo.CREATOR);
/* 11 */                OloIli oloIli = i01iloo.I0000O;
/* 52 */                new Oi00OililI((OilOol) ((OillOo0) oloIli).I00iiI, ioOlo1llOO, (IIiOiI0il) new i01II1o(i01iloo.I0000Il00O, i01iloo.I0001Ioi1lo, oloIli).I00000oIO(i01iloo.I00000oIO, UUID.fromString(oIoloo.I00iOIl), oIoloo.I00iiI), 9).I00000oOI();
                    } catch (Throwable th) {
/* 57 */                O10lo0O.I00000oIO(ioOlo1llOO, th);
                    }
                }

                @Override
                public final void I00IO1(IoOlo1llOO ioOlo1llOO, byte[] bArr) {
                    try {
/* 7 */                 OIooloO1 oIooloO1 = (OIooloO1) l1oOOloO0.I00000oOI(bArr, OIooloO1.CREATOR);
/* 9 */                 i01IlOO i01iloo = this.I000II;
/* 11 */                Context context = i01iloo.I00000oIO;
/* 13 */                OloIli oloIli = i01iloo.I0000O;
/* 52 */                new Oi00OililI((OilOol) ((OillOo0) oloIli).I00iiI, ioOlo1llOO, (IIiOiI0il) new i01O1I0(i01iloo.I0000Il00O, oloIli).I0000Il00O(context, UUID.fromString(oIooloO1.I00iOIl), oIooloO1.I00iiI.I00iOIl), 8).I00000oOI();
                    } catch (Throwable th) {
/* 57 */                O10lo0O.I00000oIO(ioOlo1llOO, th);
                    }
                }

                @Override
                public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
                    ArrayList arrayList;
/* 1 */             String str = IoOlo00.I0000oI00;
/* 3 */             int i3 = 1;
/* 4 */             if (i >= 1 && i <= 16777215) {
/* 11 */                parcel.enforceInterface(str);
                    }
/* 17 */            if (i == 1598968902) {
/* 19 */                parcel2.writeString(str);
/* 3 */                 return true;
                    }
                    switch (i) {
                        case 1:
/* 570 */                   byte[] bArrCreateByteArray = parcel.createByteArray();
/* 578 */                   IoOlo1llOO ioOlo1llOOI00000oOI = OOoolO01Ioo.I00000oOI(parcel.readStrongBinder());
/* 582 */                   i01IlOO i01iloo = this.I000II;
                            try {
/* 592 */                       arrayList = ((OO00o1) l1oOOloO0.I00000oOI(bArrCreateByteArray, OO00o1.CREATOR)).I00iOIl;
/* 594 */                       i01iloo.getClass();
                            } catch (Throwable th) {
/* 648 */                       O10lo0O.I00000oIO(ioOlo1llOOI00000oOI, th);
                            }
/* 601 */                   if (arrayList.isEmpty()) {
/* 647 */                       throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
                            }
/* 633 */                   new Oi00OililI((OilOol) ((OillOo0) i01iloo.I0000O).I00iiI, ioOlo1llOOI00000oOI, (IIiOiI0il) new i01I0IOOI10(i01iloo, null, Il1OO1ilo0o1.I00iiI, arrayList, null).I00000oIO().I00iiI, i3).I00000oOI();
/* 3 */                     return true;
                        case 2:
/* 476 */                   String string = parcel.readString();
/* 480 */                   byte[] bArrCreateByteArray2 = parcel.createByteArray();
/* 488 */                   IoOlo1llOO ioOlo1llOOI00000oOI2 = OOoolO01Ioo.I00000oOI(parcel.readStrongBinder());
/* 492 */                   i01IlOO i01iloo2 = this.I000II;
                            try {
/* 502 */                       i01OOII i01ooii = ((OO00l1Il) l1oOOloO0.I00000oOI(bArrCreateByteArray2, OO00l1Il.CREATOR)).I00iOIl;
/* 506 */                       O1oO0lOoI1 o1oO0lOoI1 = i01iloo2.I00000oOI.I000oI1ioi;
/* 510 */                       String strConcat = "enqueueUniquePeriodic_".concat(string);
/* 520 */                       OilOol oilOol = (OilOol) ((OillOo0) i01iloo2.I0000O).I00iiI;
/* 526 */                       O1oiilO o1oiilO = new O1oiilO(24);
/* 529 */                       o1oiilO.I00iiI = i01iloo2;
/* 531 */                       o1oiilO.I00iiO = string;
/* 533 */                       o1oiilO.I00iio = i01ooii;
/* 535 */                       VarHandle.storeStoreFence();
/* 560 */                       new Oi00OililI((OilOol) ((OillOo0) i01iloo2.I0000O).I00iiI, ioOlo1llOOI00000oOI2, (IIiOiI0il) l1l1IO0Ii.I00000oIO(o1oO0lOoI1, strConcat, oilOol, o1oiilO).I00iiI, 0).I00000oOI();
                            } catch (Throwable th2) {
/* 566 */                       O10lo0O.I00000oIO(ioOlo1llOOI00000oOI2, th2);
                            }
/* 3 */                     return true;
                        case 3:
/* 396 */                   byte[] bArrCreateByteArray3 = parcel.createByteArray();
/* 404 */                   IoOlo1llOO ioOlo1llOOI00000oOI3 = OOoolO01Ioo.I00000oOI(parcel.readStrongBinder());
                            try {
/* 414 */                       OO000l00O oO000l00O = (OO000l00O) l1oOOloO0.I00000oOI(bArrCreateByteArray3, OO000l00O.CREATOR);
/* 416 */                       i01IlOO i01iloo3 = this.I000II;
/* 418 */                       OIoooI0i01ol oIoooI0i01ol = oO000l00O.I00iOIl;
/* 420 */                       oIoooI0i01ol.getClass();
/* 464 */                       new Oi00OililI((OilOol) ((OillOo0) this.I000II.I0000O).I00iiI, ioOlo1llOOI00000oOI3, (IIiOiI0il) new i01I0IOOI10(i01iloo3, oIoooI0i01ol.I00000oIO, oIoooI0i01ol.I00000oOI, oIoooI0i01ol.I0000Il00O, OIoooI0i01ol.I00000oIO(i01iloo3, oIoooI0i01ol.I0000O)).I00000oIO().I00iiI, 2).I00000oOI();
                            } catch (Throwable th3) {
/* 471 */                       O10lo0O.I00000oIO(ioOlo1llOOI00000oOI3, th3);
                            }
/* 3 */                     return true;
                        case 4:
/* 314 */                   String string2 = parcel.readString();
/* 322 */                   IoOlo1llOO ioOlo1llOOI00000oOI4 = OOoolO01Ioo.I00000oOI(parcel.readStrongBinder());
/* 326 */                   i01IlOO i01iloo4 = this.I000II;
                            try {
/* 328 */                       UUID uuidFromString = UUID.fromString(string2);
/* 332 */                       i01iloo4.getClass();
/* 335 */                       OloIli oloIli = i01iloo4.I0000O;
/* 339 */                       O1oO0lOoI1 o1oO0lOoI12 = i01iloo4.I00000oOI.I000oI1ioi;
/* 348 */                       OilOol oilOol2 = (OilOol) ((OillOo0) oloIli).I00iiI;
/* 354 */                       I01ii1IIl i01ii1IIl = new I01ii1IIl(28);
/* 357 */                       i01ii1IIl.I00iiI = i01iloo4;
/* 359 */                       i01ii1IIl.I00iiO = uuidFromString;
/* 361 */                       VarHandle.storeStoreFence();
/* 384 */                       new Oi00OililI((OilOol) ((OillOo0) oloIli).I00iiI, ioOlo1llOOI00000oOI4, (IIiOiI0il) l1l1IO0Ii.I00000oIO(o1oO0lOoI12, "CancelWorkById", oilOol2, i01ii1IIl).I00iiI, 3).I00000oOI();
                            } catch (Throwable th4) {
/* 391 */                       O10lo0O.I00000oIO(ioOlo1llOOI00000oOI4, th4);
                            }
/* 3 */                     return true;
                        case 5:
/* 266 */                   String string3 = parcel.readString();
/* 274 */                   IoOlo1llOO ioOlo1llOOI00000oOI5 = OOoolO01Ioo.I00000oOI(parcel.readStrongBinder());
/* 278 */                   i01IlOO i01iloo5 = this.I000II;
                            try {
/* 302 */                       new Oi00OililI((OilOol) ((OillOo0) i01iloo5.I0000O).I00iiI, ioOlo1llOOI00000oOI5, (IIiOiI0il) i01iloo5.I00000oIO(string3).I00iiI, 4).I00000oOI();
                            } catch (Throwable th5) {
/* 309 */                       O10lo0O.I00000oIO(ioOlo1llOOI00000oOI5, th5);
                            }
/* 3 */                     return true;
                        case 6:
/* 186 */                   String string4 = parcel.readString();
/* 194 */                   IoOlo1llOO ioOlo1llOOI00000oOI6 = OOoolO01Ioo.I00000oOI(parcel.readStrongBinder());
/* 198 */                   i01IlOO i01iloo6 = this.I000II;
                            try {
/* 200 */                       i01iloo6.getClass();
/* 203 */                       OloIli oloIli2 = i01iloo6.I0000O;
/* 207 */                       O1oO0lOoI1 o1oO0lOoI13 = i01iloo6.I00000oOI.I000oI1ioi;
/* 211 */                       String strConcat2 = "CancelWorkByName_".concat(string4);
/* 220 */                       OilOol oilOol3 = (OilOol) ((OillOo0) oloIli2).I00iiI;
/* 224 */                       IIoOlIoO iIoOlIoO = new IIoOlIoO(i3);
/* 227 */                       iIoOlIoO.I00iiI = string4;
/* 229 */                       iIoOlIoO.I00iiO = i01iloo6;
/* 231 */                       VarHandle.storeStoreFence();
/* 254 */                       new Oi00OililI((OilOol) ((OillOo0) oloIli2).I00iiI, ioOlo1llOOI00000oOI6, (IIiOiI0il) l1l1IO0Ii.I00000oIO(o1oO0lOoI13, strConcat2, oilOol3, iIoOlIoO).I00iiI, 5).I00000oOI();
                            } catch (Throwable th6) {
/* 261 */                       O10lo0O.I00000oIO(ioOlo1llOOI00000oOI6, th6);
                            }
/* 3 */                     return true;
                        case 7:
/* 121 */                   IoOlo1llOO ioOlo1llOOI00000oOI7 = OOoolO01Ioo.I00000oOI(parcel.readStrongBinder());
/* 125 */                   i01IlOO i01iloo7 = this.I000II;
                            try {
/* 127 */                       IOllii iOllii = i01iloo7.I00000oOI;
/* 129 */                       OloIli oloIli3 = i01iloo7.I0000O;
/* 131 */                       O1oO0lOoI1 o1oO0lOoI14 = iOllii.I000oI1ioi;
/* 140 */                       OilOol oilOol4 = (OilOol) ((OillOo0) oloIli3).I00iiI;
/* 146 */                       I0OIOO00l0O i0OIOO00l0O = new I0OIOO00l0O(16);
/* 149 */                       i0OIOO00l0O.I00iiI = i01iloo7;
/* 151 */                       VarHandle.storeStoreFence();
/* 174 */                       new Oi00OililI((OilOol) ((OillOo0) oloIli3).I00iiI, ioOlo1llOOI00000oOI7, (IIiOiI0il) l1l1IO0Ii.I00000oIO(o1oO0lOoI14, "CancelAllWork", oilOol4, i0OIOO00l0O).I00iiI, 6).I00000oOI();
                            } catch (Throwable th7) {
/* 181 */                       O10lo0O.I00000oIO(ioOlo1llOOI00000oOI7, th7);
                            }
/* 3 */                     return true;
                        case 8:
/* 63 */                    byte[] bArrCreateByteArray4 = parcel.createByteArray();
/* 71 */                    IoOlo1llOO ioOlo1llOOI00000oOI8 = OOoolO01Ioo.I00000oOI(parcel.readStrongBinder());
                            try {
/* 81 */                        OO00ilI oO00ilI = (OO00ilI) l1oOOloO0.I00000oOI(bArrCreateByteArray4, OO00ilI.CREATOR);
/* 83 */                        i01IlOO i01iloo8 = this.I000II;
/* 105 */                       new Oi00OililI((OilOol) ((OillOo0) i01iloo8.I0000O).I00iiI, ioOlo1llOOI00000oOI8, i01iloo8.I0000O(oO00ilI.I00iOIl), 7).I00000oOI();
                            } catch (Throwable th8) {
/* 112 */                       O10lo0O.I00000oIO(ioOlo1llOOI00000oOI8, th8);
                            }
/* 3 */                     return true;
                        case 9:
/* 59 */                    I00IO1(OOoolO01Ioo.I00000oOI(parcel.readStrongBinder()), parcel.createByteArray());
/* 3 */                     return true;
                        case 10:
/* 43 */                    I001lloI(OOoolO01Ioo.I00000oOI(parcel.readStrongBinder()), parcel.createByteArray());
/* 3 */                     return true;
                        default:
/* 26 */                    return super.onTransact(i, parcel, parcel2, i2);
                    }
                }

                @Override
/* 19 */        public final IBinder asBinder() {
/* 20 */            return this;
                }
            }
