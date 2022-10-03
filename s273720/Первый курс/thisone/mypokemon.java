import ru.ifmo.se.pokemon.Pokemon;

	import ru.ifmo.se.pokemon.Type;
		
	 class Basculin extends Pokemon {
		public Basculin (String name,int level) {
			super (name,level);
			setStats(70,92,65,80,55,98);
			setType(Type.WATER);
			setMove(new DoubleTeam(),new Facade(),new FeintAttack(),new Extrasensory());
			
		}
	 }

	 class Cubchoo extends Pokemon {
			public Cubchoo (String name,int level) {
				super (name,level);
				setStats(55,70,40,60,40,40);
				setType(Type.ICE);
				setMove(new Rest(),new Swagger(), new RockTomb());
				}
	}
		class Beartic extends Cubchoo {
			public Beartic (String name,int level) {
				super (name,level);
				setStats(95,130,80,70,80,50);
				addMove(new ZenHeadbutt());
			}
						
	}
		class Fletchling extends Pokemon {
			public Fletchling (String name,int level) {
				super (name,level);
				setStats(45,50,43,40,38,62);
				setType(Type.NORMAL,Type.FLYING);
				setMove(new Confide(),new DoubleTeam());
			}
						
	}
		class Fletchinder extends Fletchling {
			public Fletchinder (String name,int level) {
				super (name,level);
				setStats(62,73,55,56,52,84);
				setType(Type.FIRE,Type.FLYING);
				addMove(new SonicBoom());
			}
						}
		class Talonflame extends Fletchinder {
			public Talonflame (String name,int level) {
				super (name,level);
				setStats(78,81,71,74,69,126);
				addMove(new TakeDown());
			}
						
	}
	
	


