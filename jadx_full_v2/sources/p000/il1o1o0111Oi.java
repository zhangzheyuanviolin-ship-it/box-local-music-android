            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.io.IOException;
            import java.util.List;
            
            public final class il1o1o0111Oi extends I01OlIoIl implements o00ii00OIlo {
                public static final Parcelable.Creator<il1o1o0111Oi> CREATOR = new iiiilIIoIi(23);
                public final lOI1lll1l10 I00iOIl;

                public il1o1o0111Oi(List list) {
                    lOI1lll1l10 loi1lll1l10I000o00OoI0I;
/* 4 */             if (list == null) {
/* 6 */                 lO1loOl0O0O lo1lool0o0o = lOI1lll1l10.I00iiI;
/* 8 */                 loi1lll1l10I000o00OoI0I = lOl10OOloi.I00ilI0I1;
                    } else {
/* 11 */                loi1lll1l10I000o00OoI0I = lOI1lll1l10.I000o00OoI0I(list);
                    }
/* 15 */            this.I00iOIl = loi1lll1l10I000o00OoI0I;
                }

                public final String toString() {
/* 6 */             lO1loOl0O0O lo1lool0o0oListIterator = this.I00iOIl.listIterator(0);
/* 12 */            StringBuilder sb = new StringBuilder();
                    try {
/* 19 */                if (lo1lool0o0oListIterator.hasNext()) {
/* 29 */                    sb.append(IliIlOOIoIo.I0000O(lo1lool0o0oListIterator.next()));
/* 36 */                    while (lo1lool0o0oListIterator.hasNext()) {
/* 38 */                        sb.append((CharSequence) ",");
/* 49 */                        sb.append(IliIlOOIoIo.I0000O(lo1lool0o0oListIterator.next()));
                            }
                        }
/* 53 */                return sb.toString();
                    } catch (IOException e) {
/* 59 */                I000II.I000O01llI0(e);
/* 62 */                return null;
                    }
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000o00OoI0I(parcel, 1, this.I00iOIl);
/* 13 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
