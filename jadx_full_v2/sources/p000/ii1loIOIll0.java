            package p000;
            
            public final class ii1loIOIll0 extends iOiloii0i1io {
                public static final ii1loIOIll0 I00ioIO = new ii1loIOIll0(new Object[0], 0);
                public final transient Object[] I00ilO0;
                public final transient int I00io1l;

                public ii1loIOIll0(Object[] objArr, int i) {
/* 2 */             super(0);
/* 5 */             this.I00ilO0 = objArr;
/* 7 */             this.I00io1l = i;
                }

                @Override
                public final int I00000oOI(Object[] objArr) {
/* 1 */             Object[] objArr2 = this.I00ilO0;
/* 4 */             int i = this.I00io1l;
/* 6 */             System.arraycopy(objArr2, 0, objArr, 0, i);
/* 29 */            return i;
                }

                @Override
                public final int I0000O() {
/* 1 */             return this.I00io1l;
                }

                @Override
                public final int I0000oI00() {
/* 1 */             return 0;
                }

                @Override
                public final Object[] I0001Ioi1lo() {
/* 1 */             return this.I00ilO0;
                }

                @Override
                public final Object get(int i) {
/* 3 */             ll011oI.I00000oIO(i, this.I00io1l);
/* 8 */             Object obj = this.I00ilO0[i];
/* 10 */            obj.getClass();
/* 29 */            return obj;
                }

                @Override
                public final int size() {
/* 1 */             return this.I00io1l;
                }
            }
