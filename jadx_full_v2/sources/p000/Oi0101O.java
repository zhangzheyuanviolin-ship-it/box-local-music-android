            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public abstract class Oi0101O {
                public static final Oi00oIl1l I00iOIl;
                public static final Oi00oIO1 I00iiI;
                public static final Oi0101O[] I00iiO;

                static {
/* 3 */             Oi00oIl1l oi00oIl1l = new Oi00oIl1l();
/* 6 */             I00iOIl = oi00oIl1l;
/* 10 */            Oi00oIO1 oi00oIO1 = new Oi00oIO1();
/* 13 */            I00iiI = oi00oIO1;
/* 16 */            Oi0101O[] oi0101OArr = {oi00oIl1l, oi00oIO1};
/* 24 */            I00iiO = oi0101OArr;
/* 26 */            ilIII1o11.I00000oIO(oi0101OArr);
                }

                public static Oi0101O valueOf(String str) {
/* 7 */             return (Oi0101O) Enum.valueOf(Oi0101O.class, str);
                }

                public static Oi0101O[] values() {
/* 7 */             return (Oi0101O[]) I00iiO.clone();
                }

                public abstract String I00000oIO(String str);
            }
