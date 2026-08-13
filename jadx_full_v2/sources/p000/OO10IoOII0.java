            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            public final class OO10IoOII0 {
                public static final ArrayList I0000oI00 = new ArrayList();
                public final I0OOO1l0IoO I00000oIO;
                public final lI0lIOoIO I00000oOI;
                public List I0000Il00O;
                public boolean I0000O;

                public OO10IoOII0(I0OOO1l0IoO i0OOO1l0IoO, lI0lIOoIO li0liooio) {
/* 1 */             ArrayList arrayList = I0000oI00;
/* 6 */             if ((arrayList instanceof O0IlIoi) && !(arrayList instanceof O0IloI1o)) {
/* 15 */                OoOOI1100oI0.I0001Ioi1lo("kotlin.collections.MutableList", arrayList);
/* 18 */                throw null;
                    }
/* 22 */            this.I00000oIO = i0OOO1l0IoO;
/* 24 */            this.I00000oOI = li0liooio;
/* 26 */            this.I0000Il00O = arrayList;
/* 29 */            this.I0000O = true;
/* 35 */            if (arrayList.isEmpty()) {
/* 37 */                return;
                    }
/* 40 */            I000II.I001IO000("The shared empty array list has been modified");
/* 89 */            throw null;
                }

                public final String toString() {
/* 34 */            return "Phase `" + this.I00000oIO.I00000oOI + "`, " + this.I0000Il00O.size() + " handlers";
                }
            }
