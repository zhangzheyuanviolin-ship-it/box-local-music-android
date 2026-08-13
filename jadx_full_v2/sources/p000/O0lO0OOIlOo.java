            package p000;

            import java.util.Collection;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public final class O0lO0OOIlOo extends il01lilooO {
                public OI000ilOol I00000oIO;
                public Set I00000oOI;
                public Function1 I0000Il00O;

                @Override
                public final boolean I00000oOI(Object obj) {
/* 1 */             OI000ilOol oI000ilOol = (OI000ilOol) obj;
/* 5 */             if (oI000ilOol == this.I00000oIO) {
/* 31 */                return true;
                    }
/* 8 */             O1iil1I01o o1iil1I01oI00iOIl = oI000ilOol.I00iOIl();
/* 14 */            if (!(o1iil1I01oI00iOIl instanceof O0lO10oooOlI)) {
/* 31 */                return true;
                    }
/* 26 */            this.I00000oOI.addAll((Collection) this.I0000Il00O.invoke(o1iil1I01oI00iOIl));
/* 29 */            return false;
                }

                @Override
                public final Object I0000Il00O() {
/* 1 */             return OoiIlOl1iI.I00000oIO;
                }
            }
