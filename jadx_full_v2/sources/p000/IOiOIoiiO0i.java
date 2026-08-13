            package p000;

            import java.util.Set;
            
            public interface IOiOIoiiO0i {
                default Object I00000oIO(Class cls) {
/* 5 */             return I000iOII(OOiilOlOOI.I00000oIO(cls));
                }

                default Set I0000oI00(OOiilOlOOI oOiilOlOOI) {
/* 9 */             return (Set) I000O01llI0(oOiilOlOOI).get();
                }

                default OOiO0Il I0001Ioi1lo(Class cls) {
/* 5 */             return I000OiO(OOiilOlOOI.I00000oIO(cls));
                }

                OOiO0Il I000O01llI0(OOiilOlOOI oOiilOlOOI);

                OOiO0Il I000OiO(OOiilOlOOI oOiilOlOOI);

                default Object I000iOII(OOiilOlOOI oOiilOlOOI) {
/* 1 */             OOiO0Il oOiO0IlI000OiO = I000OiO(oOiilOlOOI);
/* 5 */             if (oOiO0IlI000OiO == null) {
/* 7 */                 return null;
                    }
/* 9 */             return oOiO0IlI000OiO.get();
                }
            }
