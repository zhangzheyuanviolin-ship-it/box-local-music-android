            package p000;

            import android.os.IInterface;
            import android.os.Parcel;
            import com.google.android.gms.common.api.Status;
            
            public final class i0i000l1o extends i0IiIO implements IInterface {
                public final int I000O01llI0;
                public final OloIlI0ll I000OOo1O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i0i000l1o(i0i0iII i0i0iii, OloIlI0ll oloIlI0ll, int i) {
/* 8 */             super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 1);
/* 1 */             this.I000O01llI0 = i;
/* 3 */             this.I000OOo1O = oloIlI0ll;
                }

                @Override
                public final boolean I00IoO0(int i, Parcel parcel, Parcel parcel2) {
/* 1 */             OloIlI0ll oloIlI0ll = this.I000OOo1O;
/* 3 */             int i2 = this.I000O01llI0;
/* 6 */             if (i == 1) {
/* 95 */                Status status = (Status) i0OlOO.I00000oIO(parcel, Status.CREATOR);
/* 103 */               OI000Oo oI000Oo = (OI000Oo) i0OlOO.I00000oIO(parcel, OI000Oo.CREATOR);
/* 105 */               i0OlOO.I0000Il00O(parcel);
                        switch (i2) {
                            case 0:
/* 117 */                       lOillIl0ll1.I00000oOI(status, oI000Oo, oloIlI0ll);
/* 5 */                         return true;
                            default:
/* 116 */                       throw new UnsupportedOperationException();
                        }
                    }
/* 9 */             if (i == 2) {
/* 63 */                Status status2 = (Status) i0OlOO.I00000oIO(parcel, Status.CREATOR);
/* 71 */                OI00i0io0i oI00i0io0i = (OI00i0io0i) i0OlOO.I00000oIO(parcel, OI00i0io0i.CREATOR);
/* 73 */                i0OlOO.I0000Il00O(parcel);
                        switch (i2) {
                            case 1:
/* 85 */                        lOillIl0ll1.I00000oOI(status2, oI00i0io0i, oloIlI0ll);
/* 5 */                         return true;
                            default:
/* 84 */                        throw new UnsupportedOperationException();
                        }
                    }
/* 13 */            if (i == 3) {
/* 50 */                i0OlOO.I0000Il00O(parcel);
/* 53 */                OIiilo1Ool0o.I000lI();
/* 12 */                return false;
                    }
/* 16 */            if (i != 4) {
/* 12 */                return false;
                    }
/* 27 */            i0OlOO.I0000Il00O(parcel);
/* 30 */            OIiilo1Ool0o.I000lI();
/* 12 */            return false;
                }
            }
