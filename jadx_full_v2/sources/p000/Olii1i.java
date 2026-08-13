            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Olii1i {
                public static final Olii1i[] I00iiI;
                public static final Il0li01oOil I00iiO;
                public final String I00iOIl;

                static {
/* 51 */            Olii1i[] olii1iArr = {new Olii1i("KEY_BULLET_POINT", 0, "Key bullet points (3-5)"), new Olii1i("SHORT_PARAGRAPH", 1, "Short paragraph (1-2 sentences)"), new Olii1i("CONCISE_SUMMARY", 2, "Concise summary (~50 words)"), new Olii1i("HEADLINE_TITLE", 3, "Headline / title"), new Olii1i("ONE_SENTENCE_SUMMARY", 4, "One-sentence summary")};
/* 55 */            I00iiI = olii1iArr;
/* 61 */            I00iiO = ilIII1o11.I00000oIO(olii1iArr);
                }

                public Olii1i(String str, int i, String str2) {
/* 4 */             this.I00iOIl = str2;
                }

                public static Olii1i valueOf(String str) {
/* 7 */             return (Olii1i) Enum.valueOf(Olii1i.class, str);
                }

                public static Olii1i[] values() {
/* 7 */             return (Olii1i[]) I00iiI.clone();
                }
            }
