            package p000;
            
            public final class IoIOOOOlI1 extends OloIi00i {
                public final IoIOii01O I0000oI00;
                public final int I0001Ioi1lo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IoIOOOOlI1(String str, IoIOii01O ioIOii01O, int i, int i2) {
/* 6 */             super(str, true);
/* 1 */             this.I0000oI00 = ioIOii01O;
/* 3 */             this.I0001Ioi1lo = i;
                }

                @Override
                public final long I00000oIO() {
/* 5 */             this.I0000oI00.I00li1OI.getClass();
                    synchronized (this.I0000oI00) {
/* 21 */                this.I0000oI00.I00oli.remove(Integer.valueOf(this.I0001Ioi1lo));
                    }
/* 25 */            return -1L;
                }
            }
