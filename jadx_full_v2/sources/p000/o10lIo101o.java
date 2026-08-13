            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public enum o10lIo101o {
                STRING('s', 1, "-#", true),
                BOOLEAN('b', 2, "-", true),
                CHAR('c', 3, "-", true),
                DECIMAL('d', 4, "-0+ ,(", false),
                OCTAL('o', 4, "-#0(", false),
                HEX('x', 4, "-#0(", true),
                FLOAT('f', 5, "-#0+ ,(", false),
                EXPONENT('e', 5, "-#0+ (", true),
                GENERAL('g', 5, "-0+ ,(", true),
                EXPONENT_HEX('a', 5, "-#0+ ", true);

                public static final o10lIo101o[] I00ilO0 = new o10lIo101o[26];
                public final char I00iOIl;
                public final int I00iiI;
                public final int I00iiO;
                public final String I00iio;

                /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
                    	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
                    	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
                    */
                static {
/* 162 */           r0 = values();
/* 166 */           r1 = r0.length;
/* 168 */           while (r2 < r1) {
/* 180 */               p000.o10lIo101o.I00ilO0[(r3.I00iOIl | ' ') - 97] = r0;
                    }
                }

                o10lIo101o(char c, int i, String str, boolean z) {
/* 4 */             this.I00iOIl = c;
/* 6 */             this.I00iiI = i;
/* 8 */             o10o1Oo o10o1oo = o10o1Oo.I0000oI00;
/* 16 */            int i2 = true != z ? 0 : Barcode.FORMAT_ITF;
/* 22 */            for (int i3 = 0; i3 < str.length(); i3++) {
                        int iCharAt = ((int) ((o10o1Oo.I0000O >>> ((str.charAt(i3) - ' ') * 3)) & 7)) - 1;
/* 41 */                if (iCharAt < 0) {
/* 55 */                    I000II.I000iOII("invalid flags: ".concat(str));
/* 59 */                    throw null;
                        }
/* 45 */                i2 |= 1 << iCharAt;
                    }
/* 60 */            this.I00iiO = i2;
/* 82 */            this.I00iio = IlIi0I0.I000oI1ioi(new StringBuilder(String.valueOf(c).length() + 1), "%", c);
                }
            }
