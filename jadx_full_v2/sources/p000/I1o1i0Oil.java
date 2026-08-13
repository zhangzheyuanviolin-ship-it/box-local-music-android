            package p000;

            import java.util.regex.Pattern;
            
            public final class I1o1i0Oil implements IollO0 {
                public static final Pattern I00000oIO = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

                @Override
                public final OlOO1i11110 I00000oIO(IollOIOOI00 iollOIOOI00) {
/* 1 */             iOlI10l ioli10l = iollOIOOI00.I0000oI00;
/* 3 */             ioli10l.I000II();
/* 6 */             char cI000OiO = ioli10l.I000OiO();
/* 12 */            if (cI000OiO == '\n') {
/* 14 */                ioli10l.I000II();
/* 26 */                return OlOO1i11110.I000o00OoI0I(new Io1I1OI0Ool(), ioli10l.I000iOII());
                    }
/* 45 */            if (!I00000oIO.matcher(String.valueOf(cI000OiO)).matches()) {
/* 79 */                return OlOO1i11110.I000o00OoI0I(new OloOO10o("\\"), ioli10l.I000iOII());
                    }
/* 47 */            ioli10l.I000II();
/* 63 */            return OlOO1i11110.I000o00OoI0I(new OloOO10o(String.valueOf(cI000OiO)), ioli10l.I000iOII());
                }
            }
