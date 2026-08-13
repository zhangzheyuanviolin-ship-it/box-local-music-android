            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.ParcelFileDescriptor;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            
            public final class iloll1 extends ioii01Ii100 {
                @Override
                public final Object I00000oOI(iIolOi01l0o iioloi01l0o) {
                    iOlo0i1IlI iolo0i1ili;
/* 3 */             lOiIOoIi11I loiiooii11iI00000oIO = this.I00000oOI.I00000oIO();
/* 7 */             iIlI1O1liI0 iili1o1lii0 = (iIlI1O1liI0) iioloi01l0o;
/* 9 */             Parcel parcelI00Iooi00oi = iili1o1lii0.I00Iooi00oi();
/* 13 */            int i = lO0Ooi.I00000oIO;
/* 16 */            parcelI00Iooi00oi.writeInt(1);
/* 20 */            loiiooii11iI00000oIO.writeToParcel(parcelI00Iooi00oi, 0);
/* 25 */            Parcel parcelI00O0i0ii = iili1o1lii0.I00O0i0ii(35, parcelI00Iooi00oi);
/* 29 */            IBinder strongBinder = parcelI00O0i0ii.readStrongBinder();
/* 33 */            if (strongBinder == null) {
/* 35 */                iolo0i1ili = null;
                    } else {
/* 39 */                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICortanaService");
/* 55 */                iolo0i1ili = iInterfaceQueryLocalInterface instanceof iOlo0i1IlI ? (iOlo0i1IlI) iInterfaceQueryLocalInterface : new iOlo0i1IlI(strongBinder, "com.google.android.apps.aicore.aidl.ICortanaService", 12);
                    }
/* 59 */            parcelI00O0i0ii.recycle();
/* 77 */            return iolo0i1ili;
                }

                @Override
                public final iOio1i0 I0000Il00O(Object obj, Object obj2, IlloIo0O illoIo0O) throws IOException {
                    iOio1i0 iooiii11ooi1;
/* 1 */             iOlo0i1IlI iolo0i1ili = (iOlo0i1IlI) obj;
/* 3 */             illIIi01 illiii01 = (illIIi01) obj2;
/* 5 */             lO1loOl0O0O lo1lool0o0o = lOI1lll1l10.I00iiI;
/* 7 */             lOl10OOloi lol10ooloi = lOl10OOloi.I00ilI0I1;
/* 9 */             lOI1lll1l10.I000o00OoI0I(lol10ooloi);
/* 30 */            short s = (short) (((short) (((short) (((short) (((short) (((short) (0 | 1)) | 2)) | 4)) | 16)) | 32)) | 128);
/* 32 */            if (lol10ooloi == null) {
/* 370 */               IOOlIIilOl0.I000II("Null cortanaStateFileDescriptorsToRead");
/* 31 */                return null;
                    }
/* 43 */            illiii01.getClass();
/* 46 */            String str = illiii01.I00000oOI;
/* 52 */            ilo0io ilo0ioVar = new ilo0io(illiii01, this.I0000O);
/* 55 */            lOI1lll1l10 loi1lll1l10I000o00OoI0I = lOI1lll1l10.I000o00OoI0I(lol10ooloi);
/* 80 */            short s2 = (short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (s | 8)) | 64)) | 256)) | 1)) | 2)) | 4)) | 8)) | 16)) | 32)) | 128)) | 256);
/* 83 */            if (s2 != 511 || loi1lll1l10I000o00OoI0I == null) {
/* 263 */               StringBuilder sb = new StringBuilder();
/* 266 */               if (loi1lll1l10I000o00OoI0I == null) {
/* 270 */                   sb.append(" messages");
                        }
/* 275 */               if ((s2 & 1) == 0) {
/* 279 */                   sb.append(" temperature");
                        }
/* 284 */               if ((s2 & 2) == 0) {
/* 288 */                   sb.append(" topK");
                        }
/* 293 */               if ((s2 & 4) == 0) {
/* 297 */                   sb.append(" targetReplyLengthMax");
                        }
/* 302 */               if ((s2 & 8) == 0) {
/* 306 */                   sb.append(" numSamples");
                        }
/* 311 */               if ((s2 & 16) == 0) {
/* 315 */                   sb.append(" preferredImageWidth");
                        }
/* 320 */               if ((s2 & 32) == 0) {
/* 324 */                   sb.append(" preferredImageHeight");
                        }
/* 329 */               if ((s2 & 64) == 0) {
/* 333 */                   sb.append(" tokenOffset");
                        }
/* 338 */               if ((s2 & 128) == 0) {
/* 342 */                   sb.append(" numSoftTokens");
                        }
/* 347 */               if ((s2 & 256) == 0) {
/* 351 */                   sb.append(" safetyClassificationMode");
                        }
/* 364 */               I000II.I001IO000("Missing required properties:".concat(sb.toString()));
/* 31 */                return null;
                    }
/* 89 */            iI0lIOOiil ii0liooiil = new iI0lIOOiil();
/* 92 */            ii0liooiil.I00iOIl = loi1lll1l10I000o00OoI0I;
/* 95 */            ii0liooiil.I00iiI = 0.0f;
/* 97 */            ii0liooiil.I00iiO = 1;
/* 101 */           ii0liooiil.I00iio = 500;
/* 103 */           ii0liooiil.I00o101lO = null;
/* 105 */           ii0liooiil.I00ilI0I1 = 1;
/* 107 */           ii0liooiil.I00ilO0 = ilo0ioVar;
/* 109 */           ii0liooiil.I00io1l = lol10ooloi;
/* 112 */           ii0liooiil.I00ioIO = 0;
/* 114 */           ii0liooiil.I00l0I0l0lO1 = 0;
/* 116 */           ii0liooiil.I00l0OO0IO = null;
/* 120 */           ii0liooiil.I00li1OI = "cortana_type_prefix_caching";
/* 122 */           ii0liooiil.I00ll1 = str;
/* 124 */           ii0liooiil.I00lli11 = null;
/* 127 */           ii0liooiil.I00lll10 = -1;
/* 129 */           ii0liooiil.I00o0iI0io1 = 0;
/* 131 */           ii0liooiil.I00o0l1o1o0 = 1;
/* 133 */           VarHandle.storeStoreFence();
/* 138 */           iloioiOI iloioioi = new iloioiOI(this, illiii01, illoIo0O);
/* 141 */           Parcel parcelI00Iooi00oi = iolo0i1ili.I00Iooi00oi();
/* 145 */           int i = lO0Ooi.I00000oIO;
/* 147 */           parcelI00Iooi00oi.writeInt(1);
/* 150 */           ii0liooiil.writeToParcel(parcelI00Iooi00oi, 0);
/* 153 */           parcelI00Iooi00oi.writeStrongBinder(iloioioi);
/* 156 */           Parcel parcelI00O0i0ii = iolo0i1ili.I00O0i0ii(2, parcelI00Iooi00oi);
/* 160 */           IBinder strongBinder = parcelI00O0i0ii.readStrongBinder();
/* 164 */           if (strongBinder == null) {
/* 166 */               iooiii11ooi1 = null;
                    } else {
/* 170 */               IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICancellationCallback");
/* 183 */               iooiii11ooi1 = iInterfaceQueryLocalInterface instanceof iOio1i0 ? (iOio1i0) iInterfaceQueryLocalInterface : new iOOiii11OOI1(strongBinder);
                    }
/* 186 */           parcelI00O0i0ii.recycle();
                    try {
/* 189 */               int size = loi1lll1l10I000o00OoI0I.size();
/* 194 */               for (int i2 = 0; i2 < size; i2++) {
/* 200 */                   i1IO1Ol i1io1ol = (i1IO1Ol) loi1lll1l10I000o00OoI0I.get(i2);
/* 202 */                   ParcelFileDescriptor parcelFileDescriptor = i1io1ol.I00ilI0I1;
/* 204 */                   if (parcelFileDescriptor != null) {
/* 206 */                       parcelFileDescriptor.close();
                            }
/* 209 */                   ParcelFileDescriptor parcelFileDescriptor2 = i1io1ol.I00ilO0;
/* 211 */                   if (parcelFileDescriptor2 != null) {
/* 213 */                       parcelFileDescriptor2.close();
                            }
                        }
/* 219 */               lOI1lll1l10 loi1lll1l10 = ii0liooiil.I00io1l;
/* 221 */               if (loi1lll1l10 != null) {
/* 223 */                   int size2 = loi1lll1l10.size();
/* 227 */                   for (int i3 = 0; i3 < size2; i3++) {
/* 233 */                       ParcelFileDescriptor parcelFileDescriptor3 = (ParcelFileDescriptor) loi1lll1l10.get(i3);
/* 235 */                       if (parcelFileDescriptor3 != null) {
/* 237 */                           parcelFileDescriptor3.close();
                                }
                            }
                        }
/* 243 */               return iooiii11ooi1;
                    } catch (IOException unused) {
/* 244 */               iooiii11ooi1.I00000oIO();
/* 257 */               illoIo0O.I00iOIl.I0000O(ilIoOl.I00000oOI(14, null, "Inference failed."));
/* 260 */               return iooiii11ooi1;
                    }
                }

                @Override
                public final iOio1i0 I0000O(Object obj, io0O1l io0o1l) {
                    iOio1i0 iooiii11ooi1;
/* 1 */             iOlo0i1IlI iolo0i1ili = (iOlo0i1IlI) obj;
/* 3 */             Parcel parcelI00Iooi00oi = iolo0i1ili.I00Iooi00oi();
/* 7 */             int i = lO0Ooi.I00000oIO;
/* 9 */             parcelI00Iooi00oi.writeStrongBinder(io0o1l);
/* 13 */            Parcel parcelI00O0i0ii = iolo0i1ili.I00O0i0ii(3, parcelI00Iooi00oi);
/* 17 */            IBinder strongBinder = parcelI00O0i0ii.readStrongBinder();
/* 21 */            if (strongBinder == null) {
/* 23 */                iooiii11ooi1 = null;
                    } else {
/* 27 */                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICancellationCallback");
/* 41 */                iooiii11ooi1 = iInterfaceQueryLocalInterface instanceof iOio1i0 ? (iOio1i0) iInterfaceQueryLocalInterface : new iOOiii11OOI1(strongBinder);
                    }
/* 45 */            parcelI00O0i0ii.recycle();
/* 106 */           return iooiii11ooi1;
                }
            }
