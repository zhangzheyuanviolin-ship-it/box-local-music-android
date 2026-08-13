            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.regex.Matcher;
            
            public final class O1OlOOioiI implements O1OlIoo {
                public final Matcher I00000oIO;
                public final CharSequence I00000oOI;
                public final O1OlO1OoolI I0000Il00O;
                public O1OlO1II I0000O;

                public O1OlOOioiI(Matcher matcher, CharSequence charSequence) {
/* 4 */             this.I00000oIO = matcher;
/* 6 */             this.I00000oOI = charSequence;
/* 11 */            O1OlO1OoolI o1OlO1OoolI = new O1OlO1OoolI(0);
/* 14 */            o1OlO1OoolI.I00iiI = this;
/* 16 */            VarHandle.storeStoreFence();
/* 19 */            this.I0000Il00O = o1OlO1OoolI;
                }

                public final List I00000oIO() {
/* 1 */             O1OlO1II o1OlO1II = this.I0000O;
/* 3 */             if (o1OlO1II != null) {
/* 20 */                return o1OlO1II;
                    }
/* 8 */             O1OlO1II o1OlO1II2 = new O1OlO1II(0);
/* 11 */            o1OlO1II2.I00iiI = this;
/* 13 */            VarHandle.storeStoreFence();
/* 16 */            this.I0000O = o1OlO1II2;
/* 20 */            return o1OlO1II2;
                }

                public final IooO11l I00000oOI() {
/* 1 */             Matcher matcher = this.I00000oIO;
/* 11 */            return lIiioliIlo.I000O01llI0(matcher.start(), matcher.end());
                }

                public final O1OlOOioiI I0000Il00O() {
/* 1 */             Matcher matcher = this.I00000oIO;
/* 20 */            int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
/* 21 */            CharSequence charSequence = this.I00000oOI;
/* 27 */            if (iEnd <= charSequence.length()) {
/* 37 */                return lIo0ol0oI010.I00000oIO(matcher.pattern().matcher(charSequence), iEnd, charSequence);
                    }
/* 42 */            return null;
                }
            }
