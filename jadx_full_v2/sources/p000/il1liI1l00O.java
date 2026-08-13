            package p000;
            
            public final class il1liI1l00O extends ilIoilo {
                public io0o00I1ol1o I00000oIO;
                public float I00000oOI;
                public i1oloIlo0o1o I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof ilIoilo) {
/* 14 */                il1liI1l00O il1lii1l00o = (il1liI1l00O) ((ilIoilo) obj);
/* 22 */                if (this.I00000oIO.equals(il1lii1l00o.I00000oIO) && Float.floatToIntBits(this.I00000oOI) == Float.floatToIntBits(il1lii1l00o.I00000oOI)) {
/* 38 */                    i1oloIlo0o1o i1oloilo0o1o = this.I0000Il00O;
/* 40 */                    i1oloIlo0o1o i1oloilo0o1o2 = il1lii1l00o.I0000Il00O;
/* 42 */                    if (i1oloilo0o1o != null ? i1oloilo0o1o == i1oloilo0o1o2 : i1oloilo0o1o2 == null) {
/* 1 */                         return true;
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 18 */            int iHashCode = ((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.I00000oOI);
/* 19 */            i1oloIlo0o1o i1oloilo0o1o = this.I0000Il00O;
/* 30 */            return (i1oloilo0o1o == null ? 0 : i1oloilo0o1o.hashCode()) ^ (iHashCode * 1000003);
                }

                public final String toString() {
/* 1 */             i1oloIlo0o1o i1oloilo0o1o = this.I0000Il00O;
/* 5 */             String string = this.I00000oIO.toString();
/* 9 */             String strValueOf = String.valueOf(i1oloilo0o1o);
/* 17 */            StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("SummarizationResult{summaries=", string, ", processedInputRatio=");
/* 23 */            sbI001IIilI0O.append(this.I00000oOI);
/* 28 */            sbI001IIilI0O.append(", inferenceEventTraceResult=");
/* 31 */            sbI001IIilI0O.append(strValueOf);
/* 36 */            sbI001IIilI0O.append("}");
/* 39 */            return sbI001IIilI0O.toString();
                }
            }
