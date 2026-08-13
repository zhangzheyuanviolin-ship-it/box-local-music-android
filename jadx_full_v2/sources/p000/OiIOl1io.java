            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OiIOl1io extends IOoilo implements IlOil1iooOO0 {
                public final IlOil1iooOO0 I00iOIl;
                public final Ii00l101O I00iiI;
                public final int I00iiO;
                public Ii00l101O I00iio;
                public IOoil1iiIilo I00ilI0I1;

                public OiIOl1io(IlOil1iooOO0 ilOil1iooOO0, Ii00l101O ii00l101O) {
/* 5 */             super(IOiII1I.I00iiO, Il00o11.I00iOIl);
/* 8 */             this.I00iOIl = ilOil1iooOO0;
/* 10 */            this.I00iiI = ii00l101O;
/* 34 */            this.I00iiO = ((Number) ii00l101O.I00IoiI(new IiI01lI(28), 0)).intValue();
                }

                public final Object I00000oIO(IOoil1iiIilo iOoil1iiIilo, Object obj) {
/* 1 */             Ii00l101O context = iOoil1iiIilo.getContext();
/* 5 */             l01oO1iOo.I0000O(context);
/* 8 */             Ii00l101O ii00l101O = this.I00iio;
/* 10 */            if (ii00l101O != context) {
/* 14 */                if (ii00l101O instanceof Iil0llO001IO) {
/* 133 */                   throw new IllegalStateException(OlOoOOooiIll.I0000Il00O("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((Iil0llO001IO) ii00l101O).I00iiI + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
                        }
/* 25 */                O1IIii o1IIii = new O1IIii(19);
/* 28 */                o1IIii.I00iiI = this;
/* 30 */                VarHandle.storeStoreFence();
/* 45 */                if (((Number) context.I00IoiI(o1IIii, 0)).intValue() != this.I00iiO) {
/* 88 */                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.I00iiI + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                        }
/* 47 */                this.I00iio = context;
                    }
/* 134 */           this.I00ilI0I1 = iOoil1iiIilo;
/* 140 */           Object objInvoke = OiIOoio0.I00000oIO.invoke(this.I00iOIl, obj, this);
/* 150 */           if (!O0000Ioio00.I0000O(objInvoke, Ii0111o.I00iOIl)) {
/* 153 */               this.I00ilI0I1 = null;
                    }
/* 551 */           return objInvoke;
                }

                @Override
                public final Object emit(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    try {
/* 1 */                 Object objI00000oIO = I00000oIO(iOoil1iiIilo, obj);
                        return objI00000oIO == Ii0111o.I00iOIl ? objI00000oIO : OoiIlOl1iI.I00000oIO;
                    } catch (Throwable th) {
/* 23 */                this.I00iio = new Iil0llO001IO(iOoil1iiIilo.getContext(), th);
/* 89 */                throw th;
                    }
                }

                @Override
                public final Ii011lOOlI1 getCallerFrame() {
/* 1 */             IOoil1iiIilo iOoil1iiIilo = this.I00ilI0I1;
/* 5 */             if (iOoil1iiIilo instanceof Ii011lOOlI1) {
/* 7 */                 return (Ii011lOOlI1) iOoil1iiIilo;
                    }
/* 10 */            return null;
                }

                @Override
                public final Ii00l101O getContext() {
/* 1 */             Ii00l101O ii00l101O = this.I00iio;
                    return ii00l101O == null ? Il00o11.I00iOIl : ii00l101O;
                }

                @Override
                public final StackTraceElement getStackTraceElement() {
/* 1 */             return null;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             Throwable thI00000oOI = Oi10ii.I00000oOI(obj);
/* 5 */             if (thI00000oOI != null) {
/* 16 */                this.I00iio = new Iil0llO001IO(getContext(), thI00000oOI);
                    }
/* 18 */            IOoil1iiIilo iOoil1iiIilo = this.I00ilI0I1;
/* 20 */            if (iOoil1iiIilo != null) {
/* 22 */                iOoil1iiIilo.resumeWith(obj);
                    }
/* 25 */            return Ii0111o.I00iOIl;
                }
            }
