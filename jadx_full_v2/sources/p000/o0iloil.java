            package p000;
            
            public final class o0iloil {
                public final float I00000oIO;
                public final float I00000oOI;
                public final float I0000Il00O;
                public final float I0000O;

                public o0iloil(float f, float f2, float f3, float f4) {
/* 4 */             this.I00000oIO = f;
/* 6 */             this.I00000oOI = f2;
/* 8 */             this.I0000Il00O = f3;
/* 10 */            this.I0000O = f4;
                }

                public final float I00000oIO() {
/* 5 */             if (!I00000oOI()) {
/* 19 */                return 0.0f;
                    }
/* 17 */            return (this.I0000O - this.I00000oOI) * (this.I0000Il00O - this.I00000oIO);
                }

                public final boolean I00000oOI() {
/* 1 */             float f = this.I00000oIO;
/* 6 */             if (f < 0.0f) {
/* 38 */                return false;
                    }
/* 8 */             float f2 = this.I0000Il00O;
/* 12 */            if (f >= f2 || f2 > 1.0f) {
/* 38 */                return false;
                    }
/* 20 */            float f3 = this.I00000oOI;
/* 24 */            if (f3 < 0.0f) {
/* 38 */                return false;
                    }
/* 26 */            float f4 = this.I0000O;
                    return f3 < f4 && f4 <= 1.0f;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof o0iloil) {
/* 10 */                o0iloil o0iloilVar = (o0iloil) obj;
/* 24 */                if (Float.floatToIntBits(this.I00000oIO) == Float.floatToIntBits(o0iloilVar.I00000oIO) && Float.floatToIntBits(this.I00000oOI) == Float.floatToIntBits(o0iloilVar.I00000oOI) && Float.floatToIntBits(this.I0000Il00O) == Float.floatToIntBits(o0iloilVar.I0000Il00O) && Float.floatToIntBits(this.I0000O) == Float.floatToIntBits(o0iloilVar.I0000O) && Float.floatToIntBits(0.0f) == Float.floatToIntBits(0.0f)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 41 */            return ((Float.floatToIntBits(this.I0000O) ^ ((((((Float.floatToIntBits(this.I00000oIO) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.I00000oOI)) * 1000003) ^ Float.floatToIntBits(this.I0000Il00O)) * 1000003)) * 1000003) ^ Float.floatToIntBits(0.0f);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("PredictedArea{xMin=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", yMin=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", xMax=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", yMax=");
/* 42 */            return Oi010OO0.I001i1O0Ol(sb, this.I0000O, ", confidenceScore=0.0}");
                }
            }
