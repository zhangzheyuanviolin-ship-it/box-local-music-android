            package p000;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.RemoteException;
            
            public final class i0IIOl extends i0Oi011IO0 {
                public final int I00iiI;
                public final OloIlI0ll I00iiO;
                public final i0Ii1l I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i0IIOl(i0Ii1l i0ii1l, OloIlI0ll oloIlI0ll, int i, OloIlI0ll oloIlI0ll2) {
/* 7 */             super(oloIlI0ll);
/* 1 */             this.I00iiI = i;
/* 3 */             this.I00iiO = oloIlI0ll2;
/* 5 */             this.I00iio = i0ii1l;
                }

                @Override
                public final void I00000oIO() {
/* 1 */             i0Ii1l i0ii1l = this.I00iio;
                    try {
/* 6 */                 i0OIIoi i0oiioi = i0ii1l.I0000O.I000lI;
/* 8 */                 String str = i0ii1l.I00000oIO;
/* 10 */                int i = this.I00iiI;
/* 14 */                Bundle bundle = new Bundle();
/* 19 */                bundle.putInt("session_id", i);
/* 22 */                Bundle bundleI000O01llI0 = i0Ii1l.I000O01llI0();
/* 31 */                i0IO1Ollol i0io1ollol = new i0IO1Ollol(i0ii1l, this.I00iiO, 3);
/* 34 */                i0O0llIi0O01 i0o0llii0o01 = (i0O0llIi0O01) i0oiioi;
/* 36 */                Parcel parcelI00000oOI = i0o0llii0o01.I00000oOI();
/* 40 */                parcelI00000oOI.writeString(str);
/* 43 */                int i2 = i0IoOOOoOIoI.I00000oIO;
/* 46 */                parcelI00000oOI.writeInt(1);
/* 49 */                bundle.writeToParcel(parcelI00000oOI, 0);
/* 52 */                parcelI00000oOI.writeInt(1);
/* 55 */                bundleI000O01llI0.writeToParcel(parcelI00000oOI, 0);
/* 58 */                parcelI00000oOI.writeStrongBinder(i0io1ollol);
/* 63 */                i0o0llii0o01.I0000O(9, parcelI00000oOI);
                    } catch (RemoteException e) {
/* 74 */                i0Ii1l.I000II.I0000Il00O(e, "notifySessionFailed", new Object[0]);
                    }
                }
            }
