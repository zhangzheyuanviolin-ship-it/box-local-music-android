            package p000;

            import android.os.Parcel;
            import com.google.android.gms.common.api.Status;
            import java.lang.invoke.VarHandle;
            
/* 10 */    public final class l1oiO1ol1 extends iiI1l0 {
                public final int I000II = 1;
                public final Object I000O01llI0;

                public l1oiO1ol1(OloIlI0ll oloIlI0ll) {
/* 6 */             super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
/* 9 */             this.I000O01llI0 = oloIlI0ll;
                }

                @Override
                public final boolean I00000oOI(int i, Parcel parcel, Parcel parcel2) {
                    switch (this.I000II) {
                        case 0:
/* 373 */                   if (i == 2) {
/* 381 */                       Status status = (Status) iiIIoi1oIO1.I00000oIO(parcel, Status.CREATOR);
/* 383 */                       byte[] bArrCreateByteArray = parcel.createByteArray();
/* 387 */                       iiIIoi1oIO1.I0000O(parcel);
/* 392 */                       OloIlI0ll oloIlI0ll = (OloIlI0ll) this.I000O01llI0;
/* 396 */                       if (status.I00iOIl <= 0) {
                                    try {
/* 398 */                               i1o0l0i i1o0l0iVar = i1o0l0i.I00000oIO;
/* 400 */                               int i2 = i1ioiooIiOol.I00000oIO;
/* 408 */                               lOillIl0ll1.I00000oIO(status, lOo0ll1.I001IO000(bArrCreateByteArray, i1o0l0i.I00000oOI), oloIlI0ll);
                                    } catch (iI00lI e) {
/* 413 */                               oloIlI0ll.I00000oIO(e);
                                    }
                                } else {
/* 417 */                           lOillIl0ll1.I00000oIO(status, null, oloIlI0ll);
                                }
                                break;
                            }
                            break;
                        case 1:
/* 57 */                    OloIlI0ll oloIlI0ll2 = (OloIlI0ll) this.I000O01llI0;
                            switch (i) {
                                case 1:
/* 363 */                           Status status2 = (Status) iiIIoi1oIO1.I00000oIO(parcel, Status.CREATOR);
/* 365 */                           iiIIoi1oIO1.I0000O(parcel);
/* 368 */                           lOillIl0ll1.I00000oIO(status2, null, oloIlI0ll2);
                                    break;
                                case 2:
/* 348 */                           Status status3 = (Status) iiIIoi1oIO1.I00000oIO(parcel, Status.CREATOR);
/* 350 */                           iiIIoi1oIO1.I0000O(parcel);
/* 353 */                           lOillIl0ll1.I00000oIO(status3, null, oloIlI0ll2);
                                    break;
                                case 3:
/* 333 */                           Status status4 = (Status) iiIIoi1oIO1.I00000oIO(parcel, Status.CREATOR);
/* 335 */                           iiIIoi1oIO1.I0000O(parcel);
/* 338 */                           lOillIl0ll1.I00000oIO(status4, null, oloIlI0ll2);
                                    break;
                                case 4:
/* 310 */                           Status status5 = (Status) iiIIoi1oIO1.I00000oIO(parcel, Status.CREATOR);
/* 318 */                           l1iIl0OO l1iil0oo = (l1iIl0OO) iiIIoi1oIO1.I00000oIO(parcel, l1iIl0OO.CREATOR);
/* 320 */                           iiIIoi1oIO1.I0000O(parcel);
/* 323 */                           lOillIl0ll1.I00000oIO(status5, l1iil0oo, oloIlI0ll2);
                                    break;
                                case 5:
/* 295 */                           Status status6 = (Status) iiIIoi1oIO1.I00000oIO(parcel, Status.CREATOR);
/* 297 */                           iiIIoi1oIO1.I0000O(parcel);
/* 300 */                           lOillIl0ll1.I00000oIO(status6, null, oloIlI0ll2);
                                    break;
                                case 6:
/* 272 */                           Status status7 = (Status) iiIIoi1oIO1.I00000oIO(parcel, Status.CREATOR);
/* 280 */                           l1ioo00iI l1ioo00ii = (l1ioo00iI) iiIIoi1oIO1.I00000oIO(parcel, l1ioo00iI.CREATOR);
/* 282 */                           iiIIoi1oIO1.I0000O(parcel);
/* 285 */                           lOillIl0ll1.I00000oIO(status7, l1ioo00ii, oloIlI0ll2);
                                    break;
                                case 7:
/* 249 */                           Status status8 = (Status) iiIIoi1oIO1.I00000oIO(parcel, Status.CREATOR);
/* 257 */                           l1ii1l l1ii1lVar = (l1ii1l) iiIIoi1oIO1.I00000oIO(parcel, l1ii1l.CREATOR);
/* 259 */                           iiIIoi1oIO1.I0000O(parcel);
/* 262 */                           lOillIl0ll1.I00000oIO(status8, l1ii1lVar, oloIlI0ll2);
                                    break;
                                case 8:
/* 233 */                           Status status9 = (Status) iiIIoi1oIO1.I00000oIO(parcel, Status.CREATOR);
/* 235 */                           iiIIoi1oIO1.I0000O(parcel);
/* 238 */                           lOillIl0ll1.I00000oIO(status9, null, oloIlI0ll2);
                                    break;
                                case 9:
/* 209 */                           Status status10 = (Status) iiIIoi1oIO1.I00000oIO(parcel, Status.CREATOR);
/* 217 */                           l1lIII1IiI l1liii1iii = (l1lIII1IiI) iiIIoi1oIO1.I00000oIO(parcel, l1lIII1IiI.CREATOR);
/* 219 */                           iiIIoi1oIO1.I0000O(parcel);
/* 222 */                           lOillIl0ll1.I00000oIO(status10, l1liii1iii, oloIlI0ll2);
                                    break;
                                case 10:
/* 185 */                           Status status11 = (Status) iiIIoi1oIO1.I00000oIO(parcel, Status.CREATOR);
/* 193 */                           l1iIl0OO l1iil0oo2 = (l1iIl0OO) iiIIoi1oIO1.I00000oIO(parcel, l1iIl0OO.CREATOR);
/* 195 */                           iiIIoi1oIO1.I0000O(parcel);
/* 198 */                           lOillIl0ll1.I00000oIO(status11, l1iil0oo2, oloIlI0ll2);
                                    break;
                                case 11:
/* 166 */                           Status status12 = (Status) iiIIoi1oIO1.I00000oIO(parcel, Status.CREATOR);
/* 168 */                           parcel.readLong();
/* 171 */                           iiIIoi1oIO1.I0000O(parcel);
/* 174 */                           lOillIl0ll1.I00000oIO(status12, null, oloIlI0ll2);
                                    break;
                                case 12:
/* 150 */                           Status status13 = (Status) iiIIoi1oIO1.I00000oIO(parcel, Status.CREATOR);
/* 152 */                           iiIIoi1oIO1.I0000O(parcel);
/* 155 */                           lOillIl0ll1.I00000oIO(status13, null, oloIlI0ll2);
                                    break;
                                case 13:
/* 126 */                           Status status14 = (Status) iiIIoi1oIO1.I00000oIO(parcel, Status.CREATOR);
/* 134 */                           l1llooo1l10l l1llooo1l10lVar = (l1llooo1l10l) iiIIoi1oIO1.I00000oIO(parcel, l1llooo1l10l.CREATOR);
/* 136 */                           iiIIoi1oIO1.I0000O(parcel);
/* 139 */                           lOillIl0ll1.I00000oIO(status14, l1llooo1l10lVar, oloIlI0ll2);
                                    break;
                                case 14:
/* 110 */                           Status status15 = (Status) iiIIoi1oIO1.I00000oIO(parcel, Status.CREATOR);
/* 112 */                           iiIIoi1oIO1.I0000O(parcel);
/* 115 */                           lOillIl0ll1.I00000oIO(status15, null, oloIlI0ll2);
                                    break;
                                case 15:
/* 94 */                            Status status16 = (Status) iiIIoi1oIO1.I00000oIO(parcel, Status.CREATOR);
/* 96 */                            iiIIoi1oIO1.I0000O(parcel);
/* 99 */                            lOillIl0ll1.I00000oIO(status16, null, oloIlI0ll2);
                                    break;
                                case 16:
/* 70 */                            Status status17 = (Status) iiIIoi1oIO1.I00000oIO(parcel, Status.CREATOR);
/* 72 */                            long j = parcel.readLong();
/* 76 */                            iiIIoi1oIO1.I0000O(parcel);
/* 83 */                            lOillIl0ll1.I00000oIO(status17, Long.valueOf(j), oloIlI0ll2);
                                    break;
                            }
                            break;
                        default:
/* 10 */                    if (i == 2) {
/* 12 */                        byte[] bArrCreateByteArray2 = parcel.createByteArray();
/* 16 */                        iiIIoi1oIO1.I0000O(parcel);
/* 21 */                        OIloI11OoI01 oIloI11OoI01 = new OIloI11OoI01();
/* 24 */                        oIloI11OoI01.I00000oIO = bArrCreateByteArray2;
/* 26 */                        VarHandle.storeStoreFence();
/* 31 */                        IOoi01o iOoi01o = (IOoi01o) this.I000O01llI0;
/* 36 */                        iooiio1i0 iooiio1i0Var = new iooiio1i0(4);
/* 39 */                        iooiio1i0Var.I00iiI = iOoi01o;
/* 41 */                        iooiio1i0Var.I00iiO = oIloI11OoI01;
/* 43 */                        VarHandle.storeStoreFence();
/* 50 */                        ((Io1iO1Ooo0l) iOoi01o.I00000oIO).execute(iooiio1i0Var);
                                break;
                            }
                            break;
                    }
/* 6 */             return true;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 11 */        public l1oiO1ol1(lI1i1OI1O0l li1i1oi1o0l, IOoi01o iOoi01o) {
/* 13 */            super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
/* 12 */            this.I000O01llI0 = iOoi01o;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 13 */        public l1oiO1ol1(lI1i1OI1O0l li1i1oi1o0l, OloIlI0ll oloIlI0ll) {
/* 15 */            super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
/* 14 */            this.I000O01llI0 = oloIlI0ll;
                }
            }
