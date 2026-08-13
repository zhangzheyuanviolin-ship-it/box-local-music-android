            package p000;

            import java.io.File;
            import java.io.InputStream;
            
            public final class OIOi0Oli extends IlOoIo {
                @Override
                public final OoIllIioi1l I00000oOI(IoiOloi ioiOloi) {
/* 3 */             return new OIi1OliIo0Ol(ioiOloi);
                }

                @Override
                public final OoIllIioi1l I0000Il00O(IoiOloi ioiOloi) {
/* 5 */             return (OIi1OliIo0Ol) super.I0000Il00O(ioiOloi);
                }

                @Override
                public final OoIllIioi1l I0000O(File file) {
                    throw null;
                }

                @Override
                public final OoIllIioi1l I0000oI00(InputStream inputStream) {
                    throw null;
                }

                @Override
                public final OlliIl0 I0001Ioi1lo(OoIllIioi1l ooIllIioi1l, String str) {
                    return (str.equals("BASE") || str.equals("GDEF") || str.equals("GPOS") || str.equals("GSUB") || str.equals("JSTF")) ? new Iii10I010(ooIllIioi1l) : str.equals("CFF ") ? new IIOioOOi1(ooIllIioi1l) : new OlliIl0(ooIllIioi1l);
                }

                public final OIi1OliIo0Ol I000II(IIOooOII iIOooOII) {
/* 5 */             return (OIi1OliIo0Ol) super.I0000oI00(iIOooOII);
                }

                public final OIi1OliIo0Ol I000O01llI0(File file) {
/* 5 */             return (OIi1OliIo0Ol) super.I0000O(file);
                }
            }
