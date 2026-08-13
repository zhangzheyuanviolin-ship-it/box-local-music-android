            package p000;
            
/* 12 */    public final class l0O11O1I implements l0ioi11I1, l0iolil1I1, l0lO0IOIooO, l1O01olIi1, ll11OO0 {
                public static final Object I00iio = new Object();
                public static final Object I00ilI0I1 = new Object();
                public static final Object I00ilO0 = new Object();
                public static final Object I00io1l = new Object();
                public static final Object I00ioIO = new Object();
                public final int I00iOIl;
                public volatile Object I00iiI;
                public volatile Object I00iiO;

                public l0O11O1I(l0ioi11I1 l0ioi11i1) {
/* 2 */             this.I00iOIl = 0;
/* 9 */             this.I00iiI = I00iio;
/* 11 */            this.I00iiO = l0ioi11i1;
                }

                @Override
                public final Object zza() {
                    switch (this.I00iOIl) {
                        case 0:
/* 131 */                   Object objZza = this.I00iiI;
/* 133 */                   Object obj = I00iio;
/* 135 */                   if (objZza == obj) {
                                synchronized (this) {
                                    try {
/* 138 */                               objZza = this.I00iiI;
/* 140 */                               if (objZza == obj) {
/* 146 */                                   objZza = ((l0ioi11I1) this.I00iiO).zza();
/* 150 */                                   this.I00iiI = objZza;
/* 152 */                                   this.I00iiO = null;
                                        }
                                    } finally {
                                    }
                                }
                            }
/* 161 */                   return objZza;
                        case 1:
/* 100 */                   Object objZza2 = this.I00iiI;
/* 102 */                   Object obj2 = I00ilI0I1;
/* 104 */                   if (objZza2 == obj2) {
                                synchronized (this) {
                                    try {
/* 107 */                               objZza2 = this.I00iiI;
/* 109 */                               if (objZza2 == obj2) {
/* 115 */                                   objZza2 = ((l0iolil1I1) this.I00iiO).zza();
/* 119 */                                   this.I00iiI = objZza2;
/* 121 */                                   this.I00iiO = null;
                                        }
                                    } finally {
                                    }
                                }
                            }
/* 130 */                   return objZza2;
                        case 2:
/* 69 */                    Object objZza3 = this.I00iiI;
/* 71 */                    Object obj3 = I00ilO0;
/* 73 */                    if (objZza3 == obj3) {
                                synchronized (this) {
                                    try {
/* 76 */                                objZza3 = this.I00iiI;
/* 78 */                                if (objZza3 == obj3) {
/* 84 */                                    objZza3 = ((l0lO0IOIooO) this.I00iiO).zza();
/* 88 */                                    this.I00iiI = objZza3;
/* 90 */                                    this.I00iiO = null;
                                        }
                                    } finally {
                                    }
                                }
                            }
/* 99 */                    return objZza3;
                        case 3:
/* 38 */                    Object objZza4 = this.I00iiI;
/* 40 */                    Object obj4 = I00io1l;
/* 42 */                    if (objZza4 == obj4) {
                                synchronized (this) {
                                    try {
/* 45 */                                objZza4 = this.I00iiI;
/* 47 */                                if (objZza4 == obj4) {
/* 53 */                                    objZza4 = ((l1O01olIi1) this.I00iiO).zza();
/* 57 */                                    this.I00iiI = objZza4;
/* 59 */                                    this.I00iiO = null;
                                        }
                                    } finally {
                                    }
                                }
                            }
/* 68 */                    return objZza4;
                        default:
/* 7 */                     Object objZza5 = this.I00iiI;
/* 9 */                     Object obj5 = I00ioIO;
/* 11 */                    if (objZza5 == obj5) {
                                synchronized (this) {
                                    try {
/* 14 */                                objZza5 = this.I00iiI;
/* 16 */                                if (objZza5 == obj5) {
/* 22 */                                    objZza5 = ((ll11OO0) this.I00iiO).zza();
/* 26 */                                    this.I00iiI = objZza5;
/* 28 */                                    this.I00iiO = null;
                                        }
                                    } finally {
                                    }
                                }
                            }
/* 37 */                    return objZza5;
                    }
                }

/* 13 */        public l0O11O1I(l0iolil1I1 l0iolil1i1) {
                    this.I00iOIl = 1;
                    this.I00iiI = I00ilI0I1;
                    this.I00iiO = l0iolil1i1;
                }

/* 14 */        public l0O11O1I(l0lO0IOIooO l0lo0ioiooo) {
                    this.I00iOIl = 2;
                    this.I00iiI = I00ilO0;
                    this.I00iiO = l0lo0ioiooo;
                }

/* 15 */        public l0O11O1I(l1O01olIi1 l1o01olii1) {
                    this.I00iOIl = 3;
                    this.I00iiI = I00io1l;
                    this.I00iiO = l1o01olii1;
                }

/* 16 */        public l0O11O1I(ll11OO0 ll11oo0) {
                    this.I00iOIl = 4;
                    this.I00iiI = I00ioIO;
                    this.I00iiO = ll11oo0;
                }
            }
