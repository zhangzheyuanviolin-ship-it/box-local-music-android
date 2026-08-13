            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Set;
            import java.util.concurrent.ConcurrentLinkedQueue;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.logging.Level;
            
            public abstract class lO01lIOilo0 {
                public static final Oi1ol0llI I00000oIO;

                static {
                    i1Io0lIii i1io0liiiI00000oIO;
/* 7 */             ((i1O00ooO) i1IiI1.I00000oIO).getClass();
/* 10 */            AtomicReference atomicReference = i1O1Ol.I0001Ioi1lo;
/* 16 */            String strReplace = "Phlogger";
/* 18 */            if (atomicReference.get() != null) {
/* 26 */                i1io0liiiI00000oIO = ((i1OI00l0) atomicReference.get()).I00000oIO("Phlogger");
                    } else {
/* 34 */                int i = 7;
                        while (true) {
/* 35 */                    if (i >= 0) {
/* 37 */                        char cCharAt = "Phlogger".charAt(i);
/* 45 */                        if (cCharAt != '$') {
/* 52 */                            if (cCharAt == '.') {
                                        break;
                                    } else {
                                        i--;
                                    }
                                } else {
/* 47 */                            strReplace = "Phlogger".replace('$', '.');
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
/* 57 */                i1O1Ol i1o1ol = new i1O1Ol(strReplace);
/* 62 */                if (i1O1Ol.I0000Il00O || i1O1Ol.I0000O) {
/* 110 */                   Level level = Level.ALL;
/* 112 */                   Set set = i1OO0Iil001.I0001Ioi1lo;
/* 114 */                   i1OII0o1 i1oii0o1 = new i1OII0o1(strReplace);
/* 117 */                   i1oii0o1.I00000oOI = level;
/* 121 */                   i1oii0o1.I0000Il00O = i1OO0Iil001.I0001Ioi1lo;
/* 125 */                   i1oii0o1.I0000O = i1OO0Iil001.I000II;
/* 127 */                   VarHandle.storeStoreFence();
/* 130 */                   i1o1ol.I00000oOI = i1oii0o1;
                        } else if (i1O1Ol.I0000oI00) {
/* 73 */                    i1OI00l0 i1oi00l0 = i1OO0Iil001.I000O01llI0;
/* 75 */                    Set set2 = i1oi00l0.I00000oOI;
/* 77 */                    OillOo0 oillOo0 = i1oi00l0.I0000Il00O;
/* 79 */                    Level level2 = Level.OFF;
/* 83 */                    i1OO0Iil001 i1oo0iil001 = new i1OO0Iil001(strReplace);
/* 90 */                    i1oo0iil001.I00000oOI = liOO0O01.I00000oIO(strReplace);
/* 92 */                    i1oo0iil001.I0000Il00O = level2;
/* 94 */                    i1oo0iil001.I0000O = set2;
/* 96 */                    i1oo0iil001.I0000oI00 = oillOo0;
/* 98 */                    VarHandle.storeStoreFence();
/* 101 */                   i1o1ol.I00000oOI = i1oo0iil001;
                        } else {
/* 105 */                   i1o1ol.I00000oOI = null;
                        }
/* 132 */               ConcurrentLinkedQueue concurrentLinkedQueue = i1O0l11Ii.I00000oIO;
/* 134 */               concurrentLinkedQueue.offer(i1o1ol);
/* 141 */               if (atomicReference.get() != null) {
                            while (true) {
/* 147 */                       i1O1Ol i1o1ol2 = (i1O1Ol) concurrentLinkedQueue.poll();
/* 149 */                       if (i1o1ol2 == null) {
                                    break;
                                } else {
/* 163 */                           i1o1ol2.I00000oOI = ((i1OI00l0) atomicReference.get()).I00000oIO(i1o1ol2.I00000oIO);
                                }
                            }
/* 166 */                   i1O1Ol.I000II();
                        }
/* 169 */               i1io0liiiI00000oIO = i1o1ol;
                    }
/* 172 */           Oi1ol0llI oi1ol0llI = new Oi1ol0llI(2, false);
/* 175 */           oi1ol0llI.I00iiI = i1io0liiiI00000oIO;
/* 177 */           VarHandle.storeStoreFence();
/* 180 */           I00000oIO = oi1ol0llI;
                }
            }
