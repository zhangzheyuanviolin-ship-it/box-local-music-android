            package p000;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.RemoteException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            
            public final class i0I1oiiO1 extends i0Oi011IO0 {
                public final ArrayList I00iiI;
                public final HashMap I00iiO;
                public final OloIlI0ll I00iio;
                public final i0Ii1l I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i0I1oiiO1(i0Ii1l i0ii1l, OloIlI0ll oloIlI0ll, ArrayList arrayList, HashMap map, OloIlI0ll oloIlI0ll2) {
/* 9 */             super(oloIlI0ll);
/* 1 */             this.I00iiI = arrayList;
/* 3 */             this.I00iiO = map;
/* 5 */             this.I00iio = oloIlI0ll2;
/* 7 */             this.I00ilI0I1 = i0ii1l;
                }

                @Override
                public final void I00000oIO() {
/* 1 */             OloIlI0ll oloIlI0ll = this.I00iio;
/* 3 */             i0Ii1l i0ii1l = this.I00ilI0I1;
/* 5 */             ArrayList arrayList = this.I00iiI;
/* 7 */             ArrayList arrayListI000l1 = i0Ii1l.I000l1(arrayList);
                    try {
/* 13 */                i0OIIoi i0oiioi = i0ii1l.I0000O.I000lI;
/* 15 */                String str = i0ii1l.I00000oIO;
/* 19 */                Bundle bundleI000iOII = i0Ii1l.I000iOII(this.I00iiO);
/* 25 */                i0O0oOiO11 i0o0ooio11 = i0ii1l.I00000oOI;
/* 27 */                i0OI1IOoili1 i0oi1iooili1 = i0ii1l.I0000Il00O;
/* 29 */                i0Ii10i i0ii10i = new i0Ii10i(i0ii1l, oloIlI0ll);
/* 32 */                i0ii10i.I000OiO = i0o0ooio11;
/* 34 */                i0ii10i.I000iOII = i0oi1iooili1;
/* 36 */                VarHandle.storeStoreFence();
/* 39 */                i0O0llIi0O01 i0o0llii0o01 = (i0O0llIi0O01) i0oiioi;
/* 41 */                Parcel parcelI00000oOI = i0o0llii0o01.I00000oOI();
/* 45 */                parcelI00000oOI.writeString(str);
/* 48 */                parcelI00000oOI.writeTypedList(arrayListI000l1);
/* 51 */                int i = i0IoOOOoOIoI.I00000oIO;
/* 54 */                parcelI00000oOI.writeInt(1);
/* 58 */                bundleI000iOII.writeToParcel(parcelI00000oOI, 0);
/* 61 */                parcelI00000oOI.writeStrongBinder(i0ii10i);
/* 65 */                i0o0llii0o01.I0000O(2, parcelI00000oOI);
                    } catch (RemoteException e) {
/* 78 */                i0Ii1l.I000II.I0000Il00O(e, "startDownload(%s)", arrayList);
/* 86 */                oloIlI0ll.I0000Il00O(new RuntimeException(e));
                    }
                }
            }
