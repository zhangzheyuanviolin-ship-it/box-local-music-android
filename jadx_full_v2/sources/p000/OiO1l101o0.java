            package p000;

            import java.util.ArrayList;
            
            public final class OiO1l101o0 {
                public ArrayList I00000oIO;
                public ArrayList I00000oOI;
                public OiO1O1lil10 I0000Il00O;
                public ArrayList I0000O;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 57 */                return true;
                    }
/* 4 */             if (obj == null || OiO1l101o0.class != obj.getClass()) {
/* 59 */                return false;
                    }
/* 15 */            OiO1l101o0 oiO1l101o0 = (OiO1l101o0) obj;
                    return this.I00000oIO.equals(oiO1l101o0.I00000oIO) && this.I00000oOI.equals(oiO1l101o0.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oiO1l101o0.I0000Il00O) && this.I0000O.equals(oiO1l101o0.I0000O);
                }

                public final int hashCode() {
/* 35 */            return (this.I0000O.hashCode() * 31) + (this.I0000Il00O.hashCode() * 31) + (this.I00000oOI.hashCode() * 31) + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 48 */            return "SceneState(entries=" + this.I00000oIO + ", overlayScenes=" + this.I00000oOI + ", currentScene=" + this.I0000Il00O + ", previousScenes=" + this.I0000O + ')';
                }
            }
