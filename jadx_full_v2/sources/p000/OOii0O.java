            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OOii0O {
                public static final OOii0O I00l0I0l0lO1;
                public static final OOii0O[] I00l0OO0IO;
                public static final Il0li01oOil I00li1OI;
                public final String I00iOIl;
                public final String I00iiI;
                public final long I00iiO;
                public final long I00iio;
                public final long I00ilI0I1;
                public final long I00ilO0;
                public final long I00io1l;
                public final long I00ioIO;

                static {
/* 40 */            OOii0O oOii0O = new OOii0O("FAIRY_FLOSS", 0, "fairy_floss", "Fairy Floss", 4284109941L, 4290969567L, 4294949073L, 4289626623L, 4290969567L, 4294935935L);
/* 82 */            OOii0O oOii0O2 = new OOii0O("NORD", 1, "nord", "Nord", 4281218112L, 4292402921L, 4287152336L, 4286685633L, 4287610043L, 4290732394L);
/* 85 */            I00l0I0l0lO1 = oOii0O2;
/* 468 */           OOii0O[] oOii0OArr = {oOii0O, oOii0O2, new OOii0O("BIM", 2, "bim", "Bim", 4278265929L, 4289314520L, 4284392172L, 4294268832L, 4289326677L, 4294268832L), new OOii0O("BORLAND", 3, "borland", "Borland", 4278190244L, 4294967118L, 4294967118L, 4294931453L, 4288072702L, 4294929504L), new OOii0O("C64", 4, "c64", "C64", 4282397069L, 4286081476L, 4284987069L, 4290760306L, 4287315862L, 4287117618L), new OOii0O("COBALT_NEON", 5, "cobalt_neon", "Cobalt Neon", 4279511096L, 4287624582L, 4287624582L, 4282099199L, 4293519196L, 4294910752L), new OOii0O("GRASS", 6, "grass", "Grass", 4279465789L, 4294963365L, 4293373952L, 4278238139L, 4294963365L, 4290445312L), new OOii0O("HOMEBREW_OCEAN", 7, "homebrew_ocean", "Homebrew Ocean", 4280438716L, 4294967295L, 4278232754L, 4278232576L, 4288256256L, 4288217088L), new OOii0O("MONO_AMBER", 8, "mono_amber", "Mono Amber", 4281014528L, 4294939648L, 4294939648L, 4294939648L, 4294939648L, 4294939648L), new OOii0O("MONO_RED", 9, "mono_red", "Mono Red", 4281011200L, 4294915584L, 4294915584L, 4294915584L, 4294915584L, 4294915584L), new OOii0O("SYNTHWAVE", 10, "synthwave", "Synthwave", 4280689461L, 4294967295L, 4294934235L, 4278447609L, 4294893149L, 4294853712L)};
/* 472 */           I00l0OO0IO = oOii0OArr;
/* 478 */           I00li1OI = ilIII1o11.I00000oIO(oOii0OArr);
                }

                public OOii0O(String str, int i, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6) {
/* 4 */             this.I00iOIl = str2;
/* 6 */             this.I00iiI = str3;
/* 8 */             this.I00iiO = j;
/* 10 */            this.I00iio = j2;
/* 12 */            this.I00ilI0I1 = j3;
/* 14 */            this.I00ilO0 = j4;
/* 16 */            this.I00io1l = j5;
/* 19 */            this.I00ioIO = j6;
                }

                public static OOii0O valueOf(String str) {
/* 7 */             return (OOii0O) Enum.valueOf(OOii0O.class, str);
                }

                public static OOii0O[] values() {
/* 7 */             return (OOii0O[]) I00l0OO0IO.clone();
                }
            }
