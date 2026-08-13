            package p000;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            public final class i0IIOIIi extends i0Oi011IO0 {
                public final int I00iiI;
                public final String I00iiO;
                public final OloIlI0ll I00iio;
                public final int I00ilI0I1;
                public final i0Ii1l I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i0IIOIIi(i0Ii1l i0ii1l, OloIlI0ll oloIlI0ll, int i, String str, OloIlI0ll oloIlI0ll2, int i2) {
/* 11 */            super(oloIlI0ll);
/* 1 */             this.I00iiI = i;
/* 3 */             this.I00iiO = str;
/* 5 */             this.I00iio = oloIlI0ll2;
/* 7 */             this.I00ilI0I1 = i2;
/* 9 */             this.I00ilO0 = i0ii1l;
                }

                @Override
                public final void I00000oIO() {
/* 1 */             i0Ii1l i0ii1l = this.I00ilO0;
                    try {
/* 6 */                 i0OIIoi i0oiioi = i0ii1l.I0000O.I000lI;
/* 8 */                 String str = i0ii1l.I00000oIO;
/* 10 */                int i = this.I00iiI;
/* 12 */                String str2 = this.I00iiO;
/* 16 */                Bundle bundle = new Bundle();
/* 21 */                bundle.putInt("session_id", i);
/* 26 */                bundle.putString("module_name", str2);
/* 29 */                Bundle bundleI000O01llI0 = i0Ii1l.I000O01llI0();
/* 43 */                i0IOoo i0iooo = new i0IOoo(i0ii1l, this.I00iio, this.I00iiI, this.I00iiO, this.I00ilI0I1);
/* 46 */                i0O0llIi0O01 i0o0llii0o01 = (i0O0llIi0O01) i0oiioi;
/* 48 */                Parcel parcelI00000oOI = i0o0llii0o01.I00000oOI();
/* 52 */                parcelI00000oOI.writeString(str);
/* 55 */                int i2 = i0IoOOOoOIoI.I00000oIO;
/* 58 */                parcelI00000oOI.writeInt(1);
/* 61 */                bundle.writeToParcel(parcelI00000oOI, 0);
/* 64 */                parcelI00000oOI.writeInt(1);
/* 67 */                bundleI000O01llI0.writeToParcel(parcelI00000oOI, 0);
/* 70 */                parcelI00000oOI.writeStrongBinder(i0iooo);
/* 74 */                i0o0llii0o01.I0000O(7, parcelI00000oOI);
                    } catch (RemoteException e) {
/* 86 */                i0Ii1l.I000II.I0000Il00O(e, "notifyModuleCompleted", new Object[0]);
                    }
                }
            }
