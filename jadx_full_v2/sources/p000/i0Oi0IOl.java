            package p000;
            
            public final class i0Oi0IOl extends i0Oi011IO0 {
                public final int I00iiI;
                public final Object I00iiO;

                public i0Oi0IOl(Object obj, int i) {
/* 1 */             this.I00iiI = i;
/* 3 */             this.I00iiO = obj;
                }

                @Override
                public final void I00000oIO() {
                    switch (this.I00iiI) {
                        case 0:
                            synchronized (((i0Oii0oo1i) this.I00iiO).I0001Ioi1lo) {
                                try {
/* 56 */                            if (((i0Oii0oo1i) this.I00iiO).I000iOII.get() > 0 && ((i0Oii0oo1i) this.I00iiO).I000iOII.decrementAndGet() > 0) {
/* 80 */                                ((i0Oii0oo1i) this.I00iiO).I00000oOI.I0000O("Leaving the connection open for other ongoing calls.", new Object[0]);
/* 130 */                               return;
                                    }
/* 89 */                            i0Oii0oo1i i0oii0oo1i = (i0Oii0oo1i) this.I00iiO;
/* 93 */                            if (i0oii0oo1i.I000lI != null) {
/* 101 */                               i0oii0oo1i.I00000oOI.I0000O("Unbind from service.", new Object[0]);
/* 106 */                               i0Oii0oo1i i0oii0oo1i2 = (i0Oii0oo1i) this.I00iiO;
/* 112 */                               i0oii0oo1i2.I00000oIO.unbindService(i0oii0oo1i2.I000l1);
/* 118 */                               i0oii0oo1i = (i0Oii0oo1i) this.I00iiO;
/* 120 */                               i0oii0oo1i.I000II = false;
/* 122 */                               i0oii0oo1i.I000lI = null;
/* 124 */                               i0oii0oo1i.I000l1 = null;
                                    }
/* 126 */                           i0oii0oo1i.I0000oI00();
/* 130 */                           return;
                                } finally {
                                }
                            }
                        default:
/* 12 */                    i0Oii0oo1i i0oii0oo1i3 = ((i0OiI0l0lO0o) this.I00iiO).I00iOIl;
/* 20 */                    i0oii0oo1i3.I00000oOI.I0000O("unlinkToDeath", new Object[0]);
/* 31 */                    ((i0I1ioiiIioI) i0oii0oo1i3.I000lI).I000O01llI0.unlinkToDeath(i0oii0oo1i3.I000OiO, 0);
/* 34 */                    i0oii0oo1i3.I000lI = null;
/* 36 */                    i0oii0oo1i3.I000II = false;
/* 38 */                    return;
                    }
                }
            }
