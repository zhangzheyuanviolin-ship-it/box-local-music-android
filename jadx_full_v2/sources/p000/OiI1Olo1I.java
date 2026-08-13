            package p000;
            
            public final class OiI1Olo1I {
                public float I00000oIO = 0.0f;
                public boolean I00000oOI = true;
                public il00OIo0O I0000Il00O = null;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OiI1Olo1I)) {
/* 7 */                 return false;
                    }
/* 11 */            OiI1Olo1I oiI1Olo1I = (OiI1Olo1I) obj;
                    return Float.compare(this.I00000oIO, oiI1Olo1I.I00000oIO) == 0 && this.I00000oOI == oiI1Olo1I.I00000oOI && O0000Ioio00.I0000O(this.I0000Il00O, oiI1Olo1I.I0000Il00O);
                }

                public final int hashCode() {
/* 12 */            int iI000OOo1O = Oi010OO0.I000OOo1O(Float.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI);
/* 16 */            il00OIo0O il00oio0o = this.I0000Il00O;
/* 27 */            return (iI000OOo1O + (il00oio0o == null ? 0 : il00oio0o.hashCode())) * 31;
                }

                public final String toString() {
/* 38 */            return "RowColumnParentData(weight=" + this.I00000oIO + ", fill=" + this.I00000oOI + ", crossAxisAlignment=" + this.I0000Il00O + ", flowLayoutData=null)";
                }
            }
