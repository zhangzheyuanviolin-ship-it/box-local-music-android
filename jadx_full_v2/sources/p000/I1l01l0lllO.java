            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public final class I1l01l0lllO {
                public int I00000oIO;
                public int I00000oOI;
                public List I0000Il00O;
                public List I0000O;

                public static I1l01l0lllO I00000oIO(int i, int i2, ArrayList arrayList, ArrayList arrayList2) {
/* 8 */             List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(arrayList));
/* 17 */            List listUnmodifiableList2 = Collections.unmodifiableList(new ArrayList(arrayList2));
/* 21 */            I1l01l0lllO i1l01l0lllO = new I1l01l0lllO();
/* 24 */            i1l01l0lllO.I00000oIO = i;
/* 26 */            i1l01l0lllO.I00000oOI = i2;
/* 29 */            if (listUnmodifiableList == null) {
/* 49 */                IOOlIIilOl0.I000II("Null audioProfiles");
/* 28 */                return null;
                    }
/* 31 */            i1l01l0lllO.I0000Il00O = listUnmodifiableList;
/* 33 */            if (listUnmodifiableList2 == null) {
/* 43 */                IOOlIIilOl0.I000II("Null videoProfiles");
/* 28 */                return null;
                    }
/* 35 */            i1l01l0lllO.I0000O = listUnmodifiableList2;
/* 37 */            VarHandle.storeStoreFence();
/* 40 */            return i1l01l0lllO;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1l01l0lllO) {
/* 10 */                I1l01l0lllO i1l01l0lllO = (I1l01l0lllO) obj;
/* 16 */                if (this.I00000oIO == i1l01l0lllO.I00000oIO && this.I00000oOI == i1l01l0lllO.I00000oOI && this.I0000Il00O.equals(i1l01l0lllO.I0000Il00O) && this.I0000O.equals(i1l01l0lllO.I0000O)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 26 */            return this.I0000O.hashCode() ^ ((((((this.I00000oIO ^ 1000003) * 1000003) ^ this.I00000oOI) * 1000003) ^ this.I0000Il00O.hashCode()) * 1000003);
                }

                public final String toString() {
/* 48 */            return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.I00000oIO + ", recommendedFileFormat=" + this.I00000oOI + ", audioProfiles=" + this.I0000Il00O + ", videoProfiles=" + this.I0000O + "}";
                }
            }
