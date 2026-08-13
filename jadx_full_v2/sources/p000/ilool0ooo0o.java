            package p000;

            import android.app.Activity;
            
            public final class ilool0ooo0o extends iloOo1lIio {
                public final int I00ilI0I1;
                public final Activity I00ilO0;
                public final IlIII0O1il I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ilool0ooo0o(IlIII0O1il ilIII0O1il, Activity activity, int i) {
/* 15 */            super((io0oIOI1o1i) ilIII0O1il.I00iiI, true);
/* 1 */             this.I00ilI0I1 = i;
                    switch (i) {
                        case 1:
/* 55 */                    this.I00ilO0 = activity;
/* 57 */                    this.I00io1l = ilIII0O1il;
/* 63 */                    super((io0oIOI1o1i) ilIII0O1il.I00iiI, true);
                            break;
                        case 2:
/* 43 */                    this.I00ilO0 = activity;
/* 45 */                    this.I00io1l = ilIII0O1il;
/* 51 */                    super((io0oIOI1o1i) ilIII0O1il.I00iiI, true);
                            break;
                        case 3:
/* 31 */                    this.I00ilO0 = activity;
/* 33 */                    this.I00io1l = ilIII0O1il;
/* 39 */                    super((io0oIOI1o1i) ilIII0O1il.I00iiI, true);
                            break;
                        case 4:
/* 19 */                    this.I00ilO0 = activity;
/* 21 */                    this.I00io1l = ilIII0O1il;
/* 27 */                    super((io0oIOI1o1i) ilIII0O1il.I00iiI, true);
                            break;
                        default:
/* 7 */                     this.I00ilO0 = activity;
/* 9 */                     this.I00io1l = ilIII0O1il;
                            break;
                    }
                }

                @Override
                public final void I00000oIO() {
                    switch (this.I00ilI0I1) {
                        case 0:
/* 104 */                   il000illiO il000illio = ((io0oIOI1o1i) this.I00io1l.I00iiI).I0000oI00;
/* 106 */                   lII0I0I000I.I000II(il000illio);
/* 117 */                   il000illio.onActivityStartedByScionActivityInfo(il1l0io1O.I00000oOI(this.I00ilO0), this.I00iiI);
                            break;
                        case 1:
/* 81 */                    il000illiO il000illio2 = ((io0oIOI1o1i) this.I00io1l.I00iiI).I0000oI00;
/* 83 */                    lII0I0I000I.I000II(il000illio2);
/* 94 */                    il000illio2.onActivityResumedByScionActivityInfo(il1l0io1O.I00000oOI(this.I00ilO0), this.I00iiI);
                            break;
                        case 2:
/* 58 */                    il000illiO il000illio3 = ((io0oIOI1o1i) this.I00io1l.I00iiI).I0000oI00;
/* 60 */                    lII0I0I000I.I000II(il000illio3);
/* 71 */                    il000illio3.onActivityPausedByScionActivityInfo(il1l0io1O.I00000oOI(this.I00ilO0), this.I00iiI);
                            break;
                        case 3:
/* 35 */                    il000illiO il000illio4 = ((io0oIOI1o1i) this.I00io1l.I00iiI).I0000oI00;
/* 37 */                    lII0I0I000I.I000II(il000illio4);
/* 48 */                    il000illio4.onActivityStoppedByScionActivityInfo(il1l0io1O.I00000oOI(this.I00ilO0), this.I00iiI);
                            break;
                        default:
/* 12 */                    il000illiO il000illio5 = ((io0oIOI1o1i) this.I00io1l.I00iiI).I0000oI00;
/* 14 */                    lII0I0I000I.I000II(il000illio5);
/* 25 */                    il000illio5.onActivityDestroyedByScionActivityInfo(il1l0io1O.I00000oOI(this.I00ilO0), this.I00iiI);
                            break;
                    }
                }
            }
