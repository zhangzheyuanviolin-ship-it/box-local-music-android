            package p000;
            
            public abstract class iOliIII {
                public static final void I00000oIO(long j, OIilII oIilII) {
/* 6 */             if (oIilII == OIilII.I00iOIl) {
/* 12 */                if (IOo0oO11ll1O.I000OOo1O(j) != Integer.MAX_VALUE) {
/* 27 */                    return;
                        }
/* 17 */                Ioll0IliO1l.I0000Il00O("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
                    } else {
/* 25 */                if (IOo0oO11ll1O.I000OiO(j) != Integer.MAX_VALUE) {
/* 27 */                    return;
                        }
/* 30 */                Ioll0IliO1l.I0000Il00O("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
                    }
                }
            }
