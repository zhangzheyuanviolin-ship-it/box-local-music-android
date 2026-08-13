            package p000;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.RemoteException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            
/* 12 */    public final class i0IIIiIli extends i0Oi011IO0 {
                public final int I00iiI;
                public final OloIlI0ll I00iiO;
                public final Object I00iio;
                public final Object I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i0IIIiIli(i0Oii0oo1i i0oii0oo1i, OloIlI0ll oloIlI0ll, OloIlI0ll oloIlI0ll2, i0Oi011IO0 i0oi011io0) {
/* 10 */            super(oloIlI0ll);
/* 2 */             this.I00iiI = 2;
/* 4 */             this.I00iiO = oloIlI0ll2;
/* 6 */             this.I00ilI0I1 = i0oi011io0;
/* 8 */             this.I00iio = i0oii0oo1i;
                }

                @Override
                public final void I00000oIO() {
/* 4 */             int i = 5;
/* 5 */             int i2 = 0;
                    switch (this.I00iiI) {
                        case 0:
/* 157 */                   i0Ii1l i0ii1l = (i0Ii1l) this.I00iio;
/* 161 */                   List list = (List) this.I00ilI0I1;
/* 163 */                   ArrayList arrayListI000l1 = i0Ii1l.I000l1(list);
                            try {
/* 169 */                       i0OIIoi i0oiioi = i0ii1l.I0000O.I000lI;
/* 171 */                       String str = i0ii1l.I00000oIO;
/* 173 */                       Bundle bundleI000O01llI0 = i0Ii1l.I000O01llI0();
/* 181 */                       i0IO1Ollol i0io1ollol = new i0IO1Ollol(i0ii1l, this.I00iiO, i2);
/* 184 */                       i0O0llIi0O01 i0o0llii0o01 = (i0O0llIi0O01) i0oiioi;
/* 186 */                       Parcel parcelI00000oOI = i0o0llii0o01.I00000oOI();
/* 190 */                       parcelI00000oOI.writeString(str);
/* 193 */                       parcelI00000oOI.writeTypedList(arrayListI000l1);
/* 196 */                       int i3 = i0IoOOOoOIoI.I00000oIO;
/* 198 */                       parcelI00000oOI.writeInt(1);
/* 201 */                       bundleI000O01llI0.writeToParcel(parcelI00000oOI, 0);
/* 204 */                       parcelI00000oOI.writeStrongBinder(i0io1ollol);
/* 209 */                       i0o0llii0o01.I0000O(14, parcelI00000oOI);
/* 225 */                       return;
                            } catch (RemoteException e) {
/* 222 */                       i0Ii1l.I000II.I0000Il00O(e, "cancelDownloads(%s)", list);
/* 225 */                       return;
                            }
                        case 1:
/* 87 */                    OloIlI0ll oloIlI0ll = this.I00iiO;
/* 91 */                    i0Ii1l i0ii1l2 = (i0Ii1l) this.I00iio;
                            try {
/* 95 */                        i0OIIoi i0oiioi2 = i0ii1l2.I0000O.I000lI;
/* 97 */                        String str2 = i0ii1l2.I00000oIO;
/* 103 */                       Bundle bundleI000iOII = i0Ii1l.I000iOII((HashMap) this.I00ilI0I1);
/* 109 */                       i0IOll1lo i0ioll1lo = new i0IOll1lo(i0ii1l2, oloIlI0ll, i2);
/* 112 */                       i0O0llIi0O01 i0o0llii0o012 = (i0O0llIi0O01) i0oiioi2;
/* 114 */                       Parcel parcelI00000oOI2 = i0o0llii0o012.I00000oOI();
/* 118 */                       parcelI00000oOI2.writeString(str2);
/* 121 */                       int i4 = i0IoOOOoOIoI.I00000oIO;
/* 123 */                       parcelI00000oOI2.writeInt(1);
/* 126 */                       bundleI000iOII.writeToParcel(parcelI00000oOI2, 0);
/* 129 */                       parcelI00000oOI2.writeStrongBinder(i0ioll1lo);
/* 132 */                       i0o0llii0o012.I0000O(5, parcelI00000oOI2);
/* 154 */                       return;
                            } catch (RemoteException e2) {
/* 143 */                       i0Ii1l.I000II.I0000Il00O(e2, "syncPacks", new Object[0]);
/* 151 */                       oloIlI0ll.I0000Il00O(new RuntimeException(e2));
/* 154 */                       return;
                            }
                        default:
                            synchronized (((i0Oii0oo1i) this.I00iio).I0001Ioi1lo) {
                                try {
/* 18 */                            i0Oii0oo1i i0oii0oo1i = (i0Oii0oo1i) this.I00iio;
/* 20 */                            OloIlI0ll oloIlI0ll2 = this.I00iiO;
/* 24 */                            i0oii0oo1i.I0000oI00.add(oloIlI0ll2);
/* 27 */                            o0IiOl o0iiol = oloIlI0ll2.I00000oIO;
/* 31 */                            OoIOol ooIOol = new OoIOol(i);
/* 34 */                            ooIOol.I00iiI = i0oii0oo1i;
/* 36 */                            ooIOol.I00iiO = oloIlI0ll2;
/* 38 */                            VarHandle.storeStoreFence();
/* 41 */                            o0iiol.I000OiO(ooIOol);
/* 54 */                            if (((i0Oii0oo1i) this.I00iio).I000iOII.getAndIncrement() > 0) {
/* 66 */                                ((i0Oii0oo1i) this.I00iio).I00000oOI.I0000O("Already connected to the service.", new Object[0]);
                                    }
/* 80 */                            i0Oii0oo1i.I00000oOI((i0Oii0oo1i) this.I00iio, (i0Oi011IO0) this.I00ilI0I1);
                                } catch (Throwable th) {
/* 86 */                            throw th;
                                }
                            }
/* 84 */                    return;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 13 */        public i0IIIiIli(i0Ii1l i0ii1l, OloIlI0ll oloIlI0ll, Object obj, OloIlI0ll oloIlI0ll2, int i) {
                    super(oloIlI0ll);
/* 14 */            this.I00iiI = i;
                    this.I00ilI0I1 = obj;
                    this.I00iiO = oloIlI0ll2;
                    this.I00iio = i0ii1l;
                }
            }
