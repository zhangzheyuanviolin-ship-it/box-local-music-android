            package p000;
            
            public final class iOi1oioiIO extends iOiloii0i1io {
                public final transient int I00ilO0;
                public final transient int I00io1l;
                public final iOiloii0i1io I00ioIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iOi1oioiIO(iOiloii0i1io ioiloii0i1io, int i, int i2) {
/* 4 */             super(0);
/* 1 */             this.I00ioIO = ioiloii0i1io;
/* 7 */             this.I00ilO0 = i;
/* 9 */             this.I00io1l = i2;
                }

                @Override
                public final int I0000O() {
/* 12 */            return this.I00ioIO.I0000oI00() + this.I00ilO0 + this.I00io1l;
                }

                @Override
                public final int I0000oI00() {
/* 9 */             return this.I00ioIO.I0000oI00() + this.I00ilO0;
                }

                @Override
                public final Object[] I0001Ioi1lo() {
/* 3 */             return this.I00ioIO.I0001Ioi1lo();
                }

                @Override
                public final iOiloii0i1io subList(int i, int i2) {
/* 3 */             ll011oI.I00000oOI(i, i2, this.I00io1l);
/* 6 */             int i3 = this.I00ilO0;
/* 12 */            return this.I00ioIO.subList(i + i3, i2 + i3);
                }

                @Override
                public final Object get(int i) {
/* 3 */             ll011oI.I00000oIO(i, this.I00io1l);
/* 11 */            return this.I00ioIO.get(i + this.I00ilO0);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00io1l;
                }
            }
