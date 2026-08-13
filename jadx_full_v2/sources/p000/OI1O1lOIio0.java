            package p000;
            
            public final class OI1O1lOIio0 {
                public int I00000oIO;
                public float I00000oOI;
                public float I0000Il00O;
                public float I0000O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OI1O1lOIio0)) {
/* 7 */                 return false;
                    }
/* 11 */            OI1O1lOIio0 oI1O1lOIio0 = (OI1O1lOIio0) obj;
                    return this.I00000oIO == oI1O1lOIio0.I00000oIO && Float.compare(this.I00000oOI, oI1O1lOIio0.I00000oOI) == 0 && Float.compare(this.I0000Il00O, oI1O1lOIio0.I0000Il00O) == 0 && Float.compare(this.I0000O, oI1O1lOIio0.I0000O) == 0;
                }

                public final int hashCode() {
/* 28 */            return Float.hashCode(this.I0000O) + OooioIOo1.I0000O(OooioIOo1.I0000O(Integer.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI), 31, this.I0000Il00O);
                }

                public final String toString() {
/* 48 */            return "PosePoint(type=" + this.I00000oIO + ", x=" + this.I00000oOI + ", y=" + this.I0000Il00O + ", likelihood=" + this.I0000O + ")";
                }
            }
