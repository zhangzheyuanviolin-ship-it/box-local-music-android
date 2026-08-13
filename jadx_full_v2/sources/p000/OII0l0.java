            package p000;
            
            public final class OII0l0 {
                public int I00000oIO;
                public float I00000oOI;
                public float I0000Il00O;
                public float I0000O;
                public long I0000oI00;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && OII0l0.class == obj.getClass()) {
/* 17 */                OII0l0 oII0l0 = (OII0l0) obj;
                        return this.I0000Il00O == oII0l0.I0000Il00O && this.I0000O == oII0l0.I0000O && this.I00000oOI == oII0l0.I00000oOI && this.I00000oIO == oII0l0.I00000oIO && this.I0000oI00 == oII0l0.I0000oI00;
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 34 */            return Long.hashCode(this.I0000oI00) + IIl001iO0Io.I0000O(this.I00000oIO, OooioIOo1.I0000O(OooioIOo1.I0000O(Float.hashCode(this.I0000Il00O) * 31, 31, this.I0000O), 31, this.I00000oOI), 31);
                }

                public final String toString() {
/* 58 */            return "NavigationEvent(touchX=" + this.I0000Il00O + ", touchY=" + this.I0000O + ", progress=" + this.I00000oOI + ", swipeEdge=" + this.I00000oIO + ", frameTimeMillis=" + this.I0000oI00 + ')';
                }
            }
