            package p000;

            import java.util.logging.Logger;
            
/* 131 */   public final class O0o0ill01o0 {
                public final int I00000oIO;
                public String I00000oOI;
                public Object I0000Il00O;
                public volatile Object I0000O;

                public O0o0ill01o0(int i, Class cls) {
/* 1 */             this.I00000oIO = i;
                    switch (i) {
                        case 3:
/* 123 */                   this.I0000Il00O = new IIiO01(2);
/* 129 */                   this.I00000oOI = cls.getName();
                            break;
                        case 4:
/* 105 */                   this.I0000Il00O = new IIiO01(5);
/* 111 */                   this.I00000oOI = cls.getName();
                            break;
                        case 5:
/* 87 */                    this.I0000Il00O = new IIiO01(6);
/* 93 */                    this.I00000oOI = cls.getName();
                            break;
                        case 6:
/* 69 */                    this.I0000Il00O = new IIiO01(7);
/* 75 */                    this.I00000oOI = cls.getName();
                            break;
                        case 7:
/* 51 */                    this.I0000Il00O = new IIiO01(4);
/* 57 */                    this.I00000oOI = cls.getName();
                            break;
                        case 8:
/* 33 */                    this.I0000Il00O = new IIiO01(8);
/* 39 */                    this.I00000oOI = cls.getName();
                            break;
                        default:
/* 14 */                    this.I0000Il00O = new Object();
/* 20 */                    this.I00000oOI = cls.getName();
                            break;
                    }
                }

                private final Logger I0000Il00O() {
/* 3 */             Logger logger = (Logger) this.I0000O;
/* 5 */             if (logger != null) {
/* 7 */                 return logger;
                    }
                    synchronized (((IIiO01) this.I0000Il00O)) {
                        try {
/* 15 */                    Logger logger2 = (Logger) this.I0000O;
/* 17 */                    if (logger2 != null) {
/* 20 */                        return logger2;
                            }
/* 25 */                    Logger logger3 = Logger.getLogger(this.I00000oOI);
/* 29 */                    this.I0000O = logger3;
/* 32 */                    return logger3;
                        } catch (Throwable th) {
/* 113 */                   throw th;
                        }
                    }
                }

                private final Logger I0000O() {
/* 3 */             Logger logger = (Logger) this.I0000O;
/* 5 */             if (logger != null) {
/* 7 */                 return logger;
                    }
                    synchronized (((IIiO01) this.I0000Il00O)) {
                        try {
/* 15 */                    Logger logger2 = (Logger) this.I0000O;
/* 17 */                    if (logger2 != null) {
/* 20 */                        return logger2;
                            }
/* 25 */                    Logger logger3 = Logger.getLogger(this.I00000oOI);
/* 29 */                    this.I0000O = logger3;
/* 32 */                    return logger3;
                        } catch (Throwable th) {
/* 113 */                   throw th;
                        }
                    }
                }

                private final Logger I0000oI00() {
/* 3 */             Logger logger = (Logger) this.I0000O;
/* 5 */             if (logger != null) {
/* 7 */                 return logger;
                    }
                    synchronized (((IIiO01) this.I0000Il00O)) {
                        try {
/* 15 */                    Logger logger2 = (Logger) this.I0000O;
/* 17 */                    if (logger2 != null) {
/* 20 */                        return logger2;
                            }
/* 25 */                    Logger logger3 = Logger.getLogger(this.I00000oOI);
/* 29 */                    this.I0000O = logger3;
/* 32 */                    return logger3;
                        } catch (Throwable th) {
/* 113 */                   throw th;
                        }
                    }
                }

                public Logger I00000oIO() {
/* 3 */             Logger logger = (Logger) this.I0000O;
/* 5 */             if (logger != null) {
/* 7 */                 return logger;
                    }
                    synchronized (this.I0000Il00O) {
                        try {
/* 13 */                    Logger logger2 = (Logger) this.I0000O;
/* 15 */                    if (logger2 != null) {
/* 18 */                        return logger2;
                            }
/* 23 */                    Logger logger3 = Logger.getLogger(this.I00000oOI);
/* 27 */                    this.I0000O = logger3;
/* 30 */                    return logger3;
                        } catch (Throwable th) {
/* 113 */                   throw th;
                        }
                    }
                }

                public Logger I00000oOI() {
                    Logger logger;
                    Logger logger2;
                    Logger logger3;
                    Logger logger4;
                    switch (this.I00000oIO) {
                        case 2:
/* 131 */                   Logger logger5 = (Logger) this.I0000O;
/* 133 */                   if (logger5 != null) {
/* 162 */                       return logger5;
                            }
                            synchronized (((IIiO01) this.I0000Il00O)) {
                                try {
/* 143 */                           logger = (Logger) this.I0000O;
/* 145 */                           if (logger == null) {
/* 154 */                               logger = Logger.getLogger(this.I00000oOI);
/* 158 */                               this.I0000O = logger;
                                    }
                                } finally {
                                }
                            }
/* 148 */                   return logger;
                        case 3:
/* 95 */                    Logger logger6 = (Logger) this.I0000O;
/* 97 */                    if (logger6 != null) {
/* 126 */                       return logger6;
                            }
                            synchronized (((IIiO01) this.I0000Il00O)) {
                                try {
/* 107 */                           logger2 = (Logger) this.I0000O;
/* 109 */                           if (logger2 == null) {
/* 118 */                               logger2 = Logger.getLogger(this.I00000oOI);
/* 122 */                               this.I0000O = logger2;
                                    }
                                } finally {
                                }
                            }
/* 112 */                   return logger2;
                        case 4:
/* 59 */                    Logger logger7 = (Logger) this.I0000O;
/* 61 */                    if (logger7 != null) {
/* 90 */                        return logger7;
                            }
                            synchronized (((IIiO01) this.I0000Il00O)) {
                                try {
/* 71 */                            logger3 = (Logger) this.I0000O;
/* 73 */                            if (logger3 == null) {
/* 82 */                                logger3 = Logger.getLogger(this.I00000oOI);
/* 86 */                                this.I0000O = logger3;
                                    }
                                } finally {
                                }
                            }
/* 76 */                    return logger3;
                        case 5:
/* 52 */                    return I0000Il00O();
                        case 6:
/* 47 */                    return I0000O();
                        case 7:
/* 42 */                    return I0000oI00();
                        default:
/* 8 */                     Logger logger8 = (Logger) this.I0000O;
/* 10 */                    if (logger8 != null) {
/* 39 */                        return logger8;
                            }
                            synchronized (((IIiO01) this.I0000Il00O)) {
                                try {
/* 20 */                            logger4 = (Logger) this.I0000O;
/* 22 */                            if (logger4 == null) {
/* 31 */                                logger4 = Logger.getLogger(this.I00000oOI);
/* 35 */                                this.I0000O = logger4;
                                    }
                                } finally {
                                }
                            }
/* 25 */                    return logger4;
                    }
                }
            }
