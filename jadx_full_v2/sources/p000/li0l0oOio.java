            package p000;
            
            public final class li0l0oOio extends liiOlOO01i {
                public final transient int I00ilO0;
                public final transient int I00io1l;
                public final liiOlOO01i I00ioIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public li0l0oOio(liiOlOO01i liioloo01i, int i, int i2) {
/* 4 */             super(2);
/* 1 */             this.I00ioIO = liioloo01i;
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
                public final liiOlOO01i subList(int i, int i2) {
/* 3 */             lioi0i1II.I00000oOI(i, i2, this.I00io1l);
/* 6 */             int i3 = this.I00ilO0;
/* 12 */            return this.I00ioIO.subList(i + i3, i2 + i3);
                }

                @Override
                public final Object get(int i) {
/* 3 */             lioi0i1II.I00000oIO(i, this.I00io1l);
/* 11 */            return this.I00ioIO.get(i + this.I00ilO0);
                }

                @Override
                public final int size() {
/* 1 */             return this.I00io1l;
                }
            }
