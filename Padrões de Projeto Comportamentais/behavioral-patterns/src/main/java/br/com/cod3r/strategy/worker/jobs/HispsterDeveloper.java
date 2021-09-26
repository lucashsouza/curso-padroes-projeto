package br.com.cod3r.strategy.worker.jobs;

import br.com.cod3r.strategy.worker.strategies.eat.VeggieFoodStrategy;
import br.com.cod3r.strategy.worker.strategies.transportation.BikeStrategy;

public class HispsterDeveloper implements Worker {

	@Override
	public void eat() {
		new VeggieFoodStrategy().eat();
	}

	@Override
	public void move() {
		new BikeStrategy().move();
	}

	@Override
	public void work() {
		new Developer().work();
	}

}
